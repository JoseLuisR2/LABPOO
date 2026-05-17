En esta práctica se desarrolló una interfaz para la gestión de una flota espacial. El objetivo principal fue implementar componentes personalizados y un sistema de filtrado dinámico.

Decisión Técnica: Filtrado con FilteredList
Para el buscador de la parte superior, utilicé la clase FilteredList de JavaFX. Esta clase envuelve la lista original de naves y utiliza un Predicate que se actualiza cada vez que el usuario escribe en el TextField. Esto permite que la tabla se actualice en tiempo real sin necesidad de botones adicionales o de recargar la ventana manualmente.
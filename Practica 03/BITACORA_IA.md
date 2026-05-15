Me enfoqué en investigar cómo gestionar correctamente los estados de los objetos y la mejor manera de organizar los constructores para que el código fuera eficiente. La IA me ayudó a entender mejor la sintaxis de las colecciones y a pulir la lógica de los métodos de instancia para que tuvieran sentido con el dominio de la agencia espacial que elegí. Básicamente la usé como un navegador para revisar que mi diseño fuera coherente y para resolver dudas puntuales sobre el uso de ArrayList.



Prompt enviado: ¿Cuál es la forma más eficiente de inicializar una lista de objetos en Java si no conozco el tamaño final de la colección y qué ventajas tiene sobre un arreglo tradicional?

Respuesta recibida: Se recomendó el uso de la clase ArrayList porque permite un manejo dinámico de la memoria. La IA explicó que a diferencia de los arreglos fijos el ArrayList crece automáticamente conforme se añaden elementos lo cual es ideal para una flota de naves que puede variar.

Implementación y ajustes

Lo que tomé: Adopté el uso de ArrayList en la clase GestionFlota para el manejo de la colección. También apliqué la sugerencia de usar el método equalsIgnoreCase en la búsqueda por nombre para que el programa fuera más flexible con las entradas del usuario.

Lo que rechacé: La IA sugería al principio usar un constructor vacío por defecto pero decidí no incluirlo. Preferí forzar la inicialización de los datos principales desde el momento en que se crea la nave para evitar objetos con atributos nulos que pudieran causar errores en la lógica de despegue.

Ubicación en el código: Este intercambio se refleja principalmente en el archivo GestionFlota.java dentro de los métodos de registro y búsqueda y en la estructura de los tres constructores de NaveEspacial.java.
1. ¿Qué es el JavaFX Application Thread y por qué es importante?
   Es el hilo encargado de renderizar la interfaz y procesar eventos. Es vital porque JavaFX no permite modificar elementos visuales desde otros hilos; si este hilo se bloquea, la aplicación deja de responder.


2. ¿Qué es un EventHandler y cómo funciona?
   Es una interfaz que captura acciones del usuario (clics, teclas). Funciona registrando un método que se ejecuta automáticamente cuando ocurre el evento específico en un componente.


3. Diferencia entre Stage, Scene y Node

    Stage: Es la ventana principal del sistema operativo.

    Scene: Es el contenido o "escenario" que se muestra dentro de la ventana.

    Node: Es cualquier elemento visual individual (botón, tabla, etiqueta) dentro de la escena.
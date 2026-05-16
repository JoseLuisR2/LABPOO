1. ¿Qué es una race condition?
   Es un error que ocurre cuando varios hilos modifican un dato compartido al mismo tiempo, causando resultados impredecibles. En mi código, sin sincronización, dos naves podrían retirar combustible simultáneamente y dejar el tanque en valores negativos.


2. ¿Por qué synchronized resuelve el problema?
   Porque funciona como un candado que permite que solo un hilo a la vez entre al método. Su desventaja es que reduce el rendimiento, ya que los hilos deben esperar en fila, haciendo el programa más lento.


3. ¿Qué diferencia hay entre Thread.sleep() y Object.wait()?
   Thread.sleep() solo pausa el hilo sin soltar el candado del objeto. Object.wait() pausa el hilo y libera el candado para que otros hilos puedan entrar y modificar el recurso.
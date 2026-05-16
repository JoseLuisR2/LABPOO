Para esta simulación se aplicaron las siguientes estrategias de control de concurrencia en Java:

Monitores con Synchronized: Se marcaron los métodos de la clase TanqueCombustible como synchronized. Esto garantiza la exclusión mutua, permitiendo que solo un hilo ejecute la lógica de extracción o recarga en un momento dado.

Comunicación Wait y NotifyAll: En lugar de usar bucles infinitos que consumen CPU, se implementó wait() para que las naves se suspendan cuando el tanque está vacío. Cuando la cisterna recarga el tanque, utiliza notifyAll() para despertar a todos los hilos en espera y que intenten su extracción nuevamente.

Bloqueo de Seguridad (While Loop): El wait() se colocó dentro de un bucle while para verificar la condición después de despertar, evitando fallos por despertares espurios y asegurando que la nave solo proceda si realmente hay suficiente combustible.

Hilos Daemon: La cisterna se configuró como hilo de tipo Daemon para que el programa pueda finalizar automáticamente una vez que todas las naves hayan terminado su trabajo, sin esperar a que el rellenado infinito termine.
Durante esta sesión se diseñó un sistema multihilo para gestionar una estación espacial. Se exploraron las dos formas principales de crear hilos en Java: extendiendo la clase Thread para las naves y utilizando la interfaz Runnable para la cisterna de recarga.

Profundización en Concurrencia
Se implementó un pool de hilos mediante ExecutorService para manejar tareas automáticas (Sondas), lo que permite una gestión eficiente de recursos al reutilizar hilos en lugar de crear nuevos constantemente. También se analizó el impacto del uso de notifyAll() frente a notify(), optando por el primero para asegurar que todas las naves en espera tengan la oportunidad de verificar el tanque tras una recarga.

Ajustes realizados
Se corrigió la lógica del Programa Principal para asegurar que el pool de hilos se cierre correctamente con shutdown() una vez enviadas las tareas, permitiendo que la simulación termine de forma controlada.

En esta práctica el uso de IA fue mayor de manera general, ya que hay muchos conceptos que todavia no logro poner en lógica.
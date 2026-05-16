1. ¿Por qué usar cada estructura? ¿Qué pasa si uso ArrayList para todo?
   Cada una tiene una ventaja: el Mapa busca rápido y el Set evita duplicados. Si usara ArrayList para todo, las búsquedas serían muy lentas al crecer la flota y tendría naves repetidas, lo que causaría errores en el simulador.


2. ¿Diferencia entre Comparable y Comparator?
   Comparable define el orden natural y único de la clase. Comparator permite crear múltiples criterios de ordenamiento externos sin cambiar el código de la clase original.


3. ¿Qué hace un Stream? ¿Por qué es más legible?
   Un Stream es una tubería de datos que permite filtrar, transformar y agrupar información. Es más legible porque describe "qué" quiero obtener en lugar de "cómo" recorrer paso a paso la lista, eliminando el ruido visual de los bucles.
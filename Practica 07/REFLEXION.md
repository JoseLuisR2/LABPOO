1. ¿Diferencia entre excepción chequeada y no chequeada?
La chequeada es un error que el compilador te obliga a manejar o declarar. La no chequeada ocurre en tiempo de ejecución por errores de lógica y no es obligatorio escribir un try-catch para ella.

2. ¿Por qué crear una jerarquía en lugar de usar Exception?
Porque usar Exception es muy general y no te deja saber qué falló exactamente. La jerarquía permite separar errores leves de fallas críticas y darles un tratamiento distinto a cada uno.

3. ¿Ventaja de try-with-resources sobre finally?
La ventaja es que el código queda más limpio y Java cierra los recursos automáticamente. Con el bloque finally tradicional es fácil olvidar cerrar algo o escribir código extra que puede causar nuevos errores.

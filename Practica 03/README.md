Elemento de Decisión Propia

Para los métodos setter de la clase NaveEspacial definí dos reglas de validación que aseguran la integridad de la información según el dominio de la agencia espacial:

Validación de Identidad: El nombre de la nave debe tener una longitud mínima de 3 caracteres reales. Esta regla evita que se registren unidades con nombres vacíos o de una sola letra que dificulten su identificación en el sistema de control.

Capacidad de Soporte Vital: El número de tripulantes está limitado a un rango entre 0 y 10 personas. Esta restricción es necesaria porque el diseño del motor y los sistemas de oxígeno de la cabina no pueden sustentar a más de 10 ocupantes de forma segura.

Si el usuario intenta ingresar un valor que rompa estas reglas el programa muestra un mensaje descriptivo del error y mantiene el valor anterior para evitar que el objeto entre en un estado inválido.
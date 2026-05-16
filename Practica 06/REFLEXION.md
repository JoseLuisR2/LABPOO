1. ¿Cuándo usar clase abstracta vs interfaz?
   Uso clase abstracta para definir "qué es" el objeto y compartir atributos. Uso interfaz para definir "qué puede hacer" y darle habilidades opcionales.


2. ¿Por qué Java permite varias interfaces pero no herencia múltiple?
   Las interfaces solo son contratos y no causan conflictos de código. La herencia múltiple se prohíbe para evitar errores cuando dos padres tienen lógica distinta para el mismo método.


3. ¿Qué pasa si agregas un método a una interfaz?
   Todas las clases que la usan fallan al compilar. Se resuelve con un método default para darles una implementación base automática sin obligarlas a cambiar su código.
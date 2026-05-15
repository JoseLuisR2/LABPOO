¿Cuál es la diferencia entre una clase y un objeto? Da un ejemplo con tu propio código.
  La clase es la plantilla o molde a partir de la cual se van a crear objetos, por ejemplo; en mi esquema la clase seria NaveEspacial con todos sus atributos,
  a partir de esta plantilla podemos crear diferentes objetos con diferentes atributos entre si, pero manteniendo la estructura de la clase base NaveEspacial.

¿Por qué usaste 3 constructores distintos? ¿Qué problema resuelve cadauno?
  Use tres constructores para tener flexibilidad. Uno sirve para naves nuevas, otro para modelos que ya vienen con valores fijos y el de copia sirve para clonar una nave.

¿Qué pasaría si no tuvieras constructores definidos? ¿Java siguefuncionando? ¿Por qué?
  Si no escribo ningún constructor, Java pone uno vacío por default. El problema es que los atributos se quedan en blanco o en cero, y tendría que llenarlos uno por uno después.

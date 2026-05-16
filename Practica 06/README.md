Diseñé las interfaces de forma modular para que las naves tuvieran las siguientes combinaciones:

CazaCombate: Implementa Volable y Combatiente. Es la nave de ataque estándar que requiere movilidad atmosférica y capacidad ofensiva.

SondaExploradora: Implementa Volable e Investigador. Está diseñada para el reconocimiento y la toma de muestras, por lo que no necesita sistemas de ataque.

NaveHibrida: Implementa Combatiente e Investigador. Representa una estación o crucero pesado que realiza ciencia mientras se defiende, pero debido a su tamaño, no posee la capacidad de vuelo ágil de las otras dos.

Esta separación me permitió crear objetos que solo tienen los métodos que realmente necesitan, evitando que una sonda tenga métodos de ataque vacíos o que un caza tenga sensores científicos que no usará.
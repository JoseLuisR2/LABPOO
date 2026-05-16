1.- ¿Qué es la serialización y cuándo es útil?
    Es el proceso de convertir un objeto en una secuencia de bytes para guardarlo o enviarlo. Es útil para preservar el estado exacto de objetos complejos.

2.- ¿Por qué usar BufferedReader y qué mejora ofrece?
    Se utiliza porque lee grandes bloques de datos y los almacena en un búfer de memoria, mejorando el rendimiento al reducir las llamadas físicas al disco duro.

3.- ¿Riesgos de no cerrar un archivo y cómo mitigarlos?
    No cerrar archivos puede causar fugas de memoria o pérdida de datos. Se mitigó usando try-with-resources para garantizar el cierre automático.
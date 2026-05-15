1. ¿Por qué marcamos atributos como private? ¿Qué riesgo evitamos?
   Los ponemos en privado para que nadie pueda cambiar los datos por fuera de la clase. El riesgo que evitamos es que el programa se rompa al recibir datos que no tienen sentido como números negativos donde no debería haberlos.

   2. ¿Cuál es la diferencia entre private, protected y public?

       Public: Todo el mundo puede verlo y cambiarlo.

       Protected: Solo lo ven la misma clase y sus parientes o hijos.

       Private: Nadie puede verlo ni tocarlo excepto la propia clase.
   En mi código el motor usa protected para que si invento una nave nueva después esta pueda heredar sus piezas básicas.

3. ¿Qué validación incluiste en un setter? ¿Qué pasa si el valor recibido es inválido?
   Puse un límite de 10 personas para la tripulación. Si alguien intenta meter más el programa manda un aviso de error y deja el dato como estaba antes para no echar a perder la información de la nave.
# binarysearch

para hacer busqueda binaria marcamos 3 indices, uno en el final del arreglo, otro al principio y otro a la mitad, 
obtenemos los 3 valores del arreglo y comparamos con el elemento a buscar, si el elemento es menor que la mitad inferior el indice superior pasa a ser la mitad,
si el elemento es mayor que el elemento de enmedio el indice inferior pasa a ser la mitad, de esta manera eliminamos la mitad del arreglo, 
una vez que los indices superior e inferior son iguales el algoritmo termina o en dado caso de que se encuentre la coincidencia se regresa la posicion en donde se encontro el numero

- el algoritmo no funciona con datos no ordenados.

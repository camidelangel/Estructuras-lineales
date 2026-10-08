package Estructuras_lineales;

public class PilaSimple {
    //arreglo donde se almacenan los elementos de la pila
    //la capacida maxima es de 5 elementos
    int[] datos = new int[5]; // Capacidad fija de 5

    //indica la pisición del elemento que está en la cima
    //-1 significa que la pila está vacía
    int tope = -1;            // Empieza vacía


    // 1. Meter dato (Push)
    // llena la pila: inserta un elemnto en la pila y
    // tambien controla el desbordamiento
    void push(int x) {

        //si el tope todavia no llegó a la ultima posición
        //del arreglo, podemos insertar el elemento
        if (tope < datos.length - 1) {

            //movemos el tope una posición hacia arriba
            tope++;

            //guardamos el elemento en esa posición
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {

            //si ya no hay espacio, mostramos un mensaje
            System.out.println("¡Pila llena!");
        }
    }

    // 2. Sacar dato (Pop)
    //extrae el elemento que esta en la cima de la pila
    //tambien controla el subdesbordamiento (pila vacia)
    void pop() {
        //si el tope es mayor o igual a 0
        //significa que existe un elemento para sacer
        if (tope >= 0) {

            //mostramos el elemento que vamos a sacar
            System.out.println("Sacaste: " + datos[tope]);
            //movemos el tope una posición hacia abajo
            tope--;
        } else {
            //si el tope es -1, la pila esá vacia
            System.out.println("¡Pila vacía!");
        }
    }

    //3. mostrar Ver la pila
    //imprime todos los elementos que actualmente están dentro de la pila
    void mostrar() {

        System.out.print("Pila actual: ");
        //recoremos desde la posición 0 hasta el tope
        for (int i = 0; i <= tope; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    //4. IsEmppty verifica si la pila está vacia
    //regresa true si esta vacia - regresa false si tiene elementos

    boolean isEmpty(){
        return tope == -1;
    }

    //5. isFull verifica si la pila llegó a su capacidad máxima
    //regresa true si está llena - regresa false si todavia tiene espacio

    boolean isFull(){
        return tope == datos.length;
    }

    //6. peek consuslta el elemnto que esta en la cima de lapila sin eliminarlo
    //si lapila está vacia, mostramos un mensaje
    int peek(){
        if (!isEmpty()) {
            //regresamos el elemento que esta en el tope
            return datos[tope];
        } else {
            System.out.println("¡La pila esta vacia!");
            //como el metodo debe regresar int usamos -1 para indicar que no hay elemento
            return -1;
        }
    }
}

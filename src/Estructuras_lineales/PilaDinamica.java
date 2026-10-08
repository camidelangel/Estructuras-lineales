package Estructuras_lineales;

public class PilaDinamica {
    //referencia al nodo que esta en la cima de la pila
    //si cima es null, la pila está vacia
    Nodo cima;

    //constructor de la pila: crea una pila vacia
    public PilaDinamica(){
        //arranca vacia, no existen nodos en la pila
        this.cima = null;
    }//fin del constructor

    //1. metodo push inserta nuevos elementos arriba de la pila
    void push (int x){

        //creamos el nuevo nodo con el valor recibido
        Nodo nuevo = new Nodo (x);

        //como tiene las mismas propiedades que cada nodo no necesita el nuevo atrapa al viejo de la cima
        //el nuevo nodo apunta a lla antigua cima
        nuevo.siguiente = cima;

        //actualizamos la cima para que apunte al nuevo nodo
        cima = nuevo;

        //informamos que el elemento fue insertado
        System.out.println("Metiste: " + x);
    }
    //nota : nuevo.siguiente es la flecha
    //2. metodo pop sacar el elemento de arriba y lo elimina
    void pop (){

        // Comprobamos que la pila no esté vacía.
        if (!isEmpty()) {

            // Mostramos el valor que vamos a sacar.
            System.out.println("Sacaste de la pila: " + cima.dato);

            // La cima pasa a ser el siguiente nodo.
            cima = cima.siguiente;

        } else {

            // Si no hay nodos, no podemos extraer elementos.
            System.out.println("¡Pila dinámica vacía!");
        }
    }
    //3.metodo mostrar: recorre e imprime todos los elementos de la pila
    //comienza en la cima y avanza hasta el ultimo nodo
    void  mostrar(){

        //creamos una referencia auxiliar para recorrer la pila
        Nodo actual = cima; //nuestro explorador arranca en la cima

        System.out.println("pila dinamica (cima -> fondo): ");

        //recorremos mientras existan nodos
        while (actual != null){

            //imprimimos el dato del nodo actual
            System.out.println(actual.dato + " ");

            //avanzamos al siguiente nodo
            actual = actual.siguiente; //saltamos al siguiente nodo
        }
        System.out.println();//salto de linea
    }
    //4. isEmpty comprueba si la pila está vacia
    //si cima es null es true - si existe al menos un nodo es false
    public boolean isEmpty() {

        return cima == null;
    }
    //5. peek sonsulta el elemnto que esta en la cima sin eliminarlo
    // devuelve el dato de la cima y devuelve -1 si la pila esta vacia
    public int peek(){
        //comprobamos que la pila tenga elementos
        if (!isEmpty()){

            //devolvemos el dato de la cima sin modificarla
            return cima.dato;
        } else {
            //informamos que no hay ningun elemnto que consultar
            System.out.println("¡Pila dinamica vacia");

            //delvovemos -1 como indicador de que esta vacia
            return -1;
        }
    }
}

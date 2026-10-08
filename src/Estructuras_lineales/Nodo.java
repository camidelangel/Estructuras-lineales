package Estructuras_lineales;

public class Nodo {
    //valor entero que almacenara el nodo
    int dato;

    //referencia al siguiente nodo de la pila
    //la flecha que aunta al de abajo tiene que se de la misma clase
    Nodo siguiente;

    //constructor del nodo: recibe el valor que guardará el nodo
    public Nodo(int x) {

        //guardamos el valor recibido
        this.dato = x; //para que nasca con un valor y no con basura

        //el nodo comienza sin apuntar a otro nodo
        this.siguiente = null;   //al nacer, no apunte a nadie todavia
    }
}

package Estructuras_lineales;

public class LanzadorPilaSimple {
    public static void main(String[] args) {

        //creamos una nueva pila
        PilaSimple p = new PilaSimple();

        //probar isEmpty la pila recien creada debe de star vacia
        System.out.println("¿La pila esta vacia? " + p.isEmpty());

        //insertar elemtos con push

        p.push(10);
        p.push(20);
        p.push(30);

        //muestra el contenido de la pila
        p.mostrar();

        //peek debe mostrar 30, pero no eliminarlo
        System.out.println("Elemento en la cima de la pila " + p.peek());
        //comprobamos que el 30 sgue en la pila
        p.mostrar();

        //saca el elemento de la pila, debe sacar el 30
        p.pop(); //saca el 30
        //muestra nuevamente la pila
        p.mostrar();

        //ahora el tope debe ser 20
        System.out.println("Nuevo elemento en el tope" + p.peek());

        //isFull agrega elementos hasta llenar  la pila
        p.push(40);
        p.push(50);
        p.push(60);
        //mostramos nuevamente la pila
        p.mostrar();

        //verificamos si la pila esta llena
        System.out.println("¿La pila esta llena?" + p.isFull());

        //muestra si la pila ya esta llena por lo tanto muestra el mensae pila llena
        p.push(70);

        //vaciar pila
        p.pop();
        p.pop();
        p.pop();
        p.pop();

        // Ahora la pila debe estar vacía.
        System.out.println("¿La pila está vacía? " + p.isEmpty());


        // Intentamos sacar otro elemento.
        // Debe mostrar Pila vacía
        p.pop();
    }
}

package Estructuras_lineales.Cola;

public class MainColaDinamica {
    public static void main(String[] args) {

        // Crea una cola dinámica inicialmente vacía.
        ColaDinamica miCola = new ColaDinamica();

        System.out.println("=== COLA DINÁMICA ===");

        // Agrega tres nodos.
        miCola.enqueue(100);
        miCola.enqueue(200);
        miCola.enqueue(300);

        miCola.mostrar();

        // Consulta el primer nodo sin desvincularlo.
        System.out.println("Elemento al frente (peek): " + miCola.peek());

        // Cuenta los nodos mediante un recorrido.
        System.out.println("Cantidad de nodos: " + miCola.contarElementos());

        // Retira el primer nodo.
        miCola.dequeue();
        miCola.mostrar();

        // Agrega otro nodo al final.
        miCola.enqueue(400);
        miCola.mostrar();

        System.out.println("Cantidad final de nodos: " + miCola.contarElementos());
    }
}

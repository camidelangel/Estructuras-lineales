package Estructuras_lineales.Cola;

public class MainColaCicular {
    public static void main(String[] args) {

        // Crea una cola circular de capacidad tres.
        ColaEstaticaCircular miCola = new ColaEstaticaCircular(3);

        System.out.println("=== COLA ESTÁTICA CIRCULAR ===");

        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        miCola.mostrar();

        // peek consulta el frente sin extraerlo.
        System.out.println("Elemento al frente (peek): " + miCola.peek());

        // Retira dos elementos para liberar posiciones.
        miCola.dequeue();
        miCola.dequeue();

        miCola.mostrar();

        // La cola circular puede utilizar los espacios liberados.
        miCola.enqueue(40);
        miCola.enqueue(50);

        miCola.mostrar();

        System.out.println("Cantidad de elementos: " + miCola.contarElementos());
    }
}

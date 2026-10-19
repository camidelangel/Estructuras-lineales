package Estructuras_lineales.Cola;
//Programa principal para probar la cola estática lineal.
public class MainColaEsta {
    public static void main(String[] args){
        //creamos una cola con espacio para 3 personas/elementos
        ColaEstatica miCola = new ColaEstatica(3);

        System.out.println("=== COLA ESTÁTICA LINEAL ===");
        //inserta elementos
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);


        //vemos como queda lla fila
        miCola.mostrar();
        // Consulta el frente sin eliminar el elemento.
        System.out.println("Elemento al frente (peek): " + miCola.peek());
        System.out.println("Cantidad de elementos: " + miCola.contarElementos());

        //atendemos el primero
        miCola.dequeue();
        //vemos como quedo la fila despues de atender
        miCola.mostrar();

        // El arreglo ya llegó al final: no reutiliza el espacio liberado.
        miCola.enqueue(40);

        // Muestra el estado final.
        miCola.mostrar();
    }
}

package Estructuras_lineales.Cola;
import Estructuras_lineales.Pila.Nodo;
/*Cola dinámica implementada mediante nodos enlazados.
 * No requiere reservar un arreglo de capacidad fija.
 * Su crecimiento depende de la memoria disponible.
 */
public class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    //Inicializa la cola sin elementos. */
    public ColaDinamica() {
        frente = null;
        fin = null;
    }

    // Comprueba si no hay nodos en la cola. */
    public boolean estaVacia() {
        return frente == null;
    }

    /*Agrega un nuevo nodo al final de la cola.
     *
     * @param valor dato que se insertará.
     */
    public void enqueue(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            // El primer nodo es frente y fin al mismo tiempo.
            frente = nuevo;
            fin = nuevo;

        } else {
            // Enlaza el nodo nuevo después del último.
            fin.siguiente = nuevo;

            // Actualiza el último nodo.
            fin = nuevo;
        }

        System.out.println("Entró a la fila dinámica: " + valor);
    }

    /*Retira el nodo que está al frente.
     *
     * @return dato retirado o -1 si está vacía.
     */
    public int dequeue() {
        if (estaVacia()) {
            System.out.println("Error: la cola dinámica está vacía.");
            return -1;
        }
        int valor = frente.dato;
        // El segundo nodo pasa a ser el frente.
        frente = frente.siguiente;
        // Si no quedan nodos, también se limpia fin.
        if (frente == null) {
            fin = null;
        }

        System.out.println("Atendido y fuera: " + valor);
        return valor;
    }

    /*
     * Consulta el dato del primer nodo sin eliminarlo.
     */
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola dinámica está vacía; no hay elemento al frente.");
            return -1;
        }
        return frente.dato;
    }
    /*
     * Cuenta los nodos activos mediante un recorrido.
     *
     * @return número total de nodos.
     */
    public int contarElementos() {
        int contador = 0;
        // Se usa un auxiliar para no modificar frente.
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            // Avanza al siguiente nodo.
            actual = actual.siguiente;
        }
        return contador;
    }

    // Muestra los nodos desde frente hasta fin. */
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola dinámica está vacía.");
            return;
        }
        Nodo actual = frente;
        System.out.print("Fila Actual ");

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println("<- Fin");
    }

}

package Estructuras_lineales.Cola;
//cola circular estatica implementacion con un arreglo
//el operador modulo permite regresar al inicio del arreglo cuando se alcanza su ultima posicion

public class ColaEstaticaCircular {
    private  final int[] arreglo;
    private int frente;
    private int fin;
    private final int capacidad;
    //se agrega este atributo tamaño para llevar el control exacto de elementos y evitar que fin colapse
    private int tamanio;

    //constructor: crear un cola cicular vacia
    public ColaEstaticaCircular(int capacidad){
        if (capacidad <= 0){
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero");
        }
        this.capacidad = capacidad;
        this.arreglo = new int [capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0; //arranca en 0 porque la cola empieza vacia
    }

    //Comprueba si la cola está vacía.
    public boolean estaVacia() {
        return tamanio == 0;
    }

    // Comprueba si todos los espacios están ocupados.
    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    //metodo para meter gente al final de la cola
    public void enqueue (int valor){
        //validacion infalible usando el tamaño actual
        if (estaLlena()){ //tamaño la var para contar los que estan formados y
            //capacidad es la var que tiene el vector
            System.out.println("Error: la cola esta llena");
            return; // si esta llena la cola retorna
        }
        //el truco de la vuelta al ruedo con modulo
        arreglo[fin] = valor;
        // El índice regresa a cero al llegar al límite.
        fin = (fin + 1) % capacidad;
        tamanio++;
        System.out.println("Entró a la fila circular: " + valor);
    }
    //retira el elemento que esta al frente
    public int dequeue() {
        if (estaVacia()) {
            System.out.println(
                    "Error: la cola circular está vacía.");
            return -1;
        }
        int valor = arreglo[frente];
        // Avanza circularmente el índice del frente.
        frente = (frente + 1) % capacidad;
        tamanio--;
        System.out.println("Atendido y fuera: " + valor);
        return valor;
    }

    //Consulta el elemento del frente sin extraerlo.
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola circular está vacía; no hay elemento al frente.");
            return -1;
        }
        return arreglo[frente];
    }

    //Muestra los elementos en su orden lógico.
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola circular está vacía.");
            return;
        }
        System.out.print("Fila actual ");
        for (int i = 0; i < tamanio; i++) {
            // Calcula cada posición respetando el ciclo.
            int indice = (frente + i) % capacidad;
            System.out.print(arreglo[indice] + " ");
        }

        System.out.println(" ");
    }

    //Devuelve la cantidad actual de elementos. */
    public int contarElementos() {
        return tamanio;
    }
}

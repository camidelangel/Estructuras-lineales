package Estructuras_lineales.Cola;

/*
 * cola estatica lineal implementada mediante un arreglo
 * la capacidad se establece al crear el objeto
 */

public class ColaEstatica {
    private  int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamanio;

    /*constructor: crea cola vacia
    * tamanio capacidad maxima del arreglo
    * */
    public ColaEstatica(int tamano){//tamaño variable temporal que entra en el main es 3
        if (tamano <= 0){
            throw new IllegalArgumentException( "El tamaño debe ser mayor que cero");
        }

        this.capacidad = tamano; //deficni,os capacidad = tamaño
        this.arreglo = new int[this.capacidad];//aqui es onde definimos el tamaño del arreglo
        this.frente = 0; //inicializamos frente el que esta al inicio
        this.fin = -1; //inicializamos fin, numero fantasma
        this.tamanio = 0;
    }
    // comprueba si la cola esta vacia
    public boolean estaVacia(){
        return tamanio == 0;
    }
    //comprueba si el indice de insercion llego al ultimo espacio del arreglo
    public boolean estaLlena() {
        return fin == capacidad - 1;
    }

    //inserts un elemento al final de la cola
    public void enqueue(int valor){
        if (estaLlena()){//agregar un elemento al final de la cola
            System.out.println("eror : la cola esta llena");
        }else {
            fin++;//actualizamos la fila
            arreglo[fin]= valor;//agregamos al arreglo
            tamanio ++;
            System.out.println("Entro a al fila" + valor);//imprimemos
        }
    }

    //retira el elemento que esta al frente
    public void dequeue(){//saca al primero de la fila
        if (estaVacia()){ //si frente llega a ser mayor que fin la fila se vacia
            System.out.println("Error: la cola esta vacia");
        }else {
            int valor = arreglo[frente];
            System.out.println("Atendido y fuera: " + valor);//atiende e imprime
            frente ++; //actualiza frente cuando se atiende un elemento de la fila
            tamanio --;
        }
    }

    //consulta el elemento del frente sin retirarlo. no modifica frente, fin ni el tamaño

    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía; no hay elemento al frente.");
            return -1;
        }

        return arreglo[frente];
    }

    //muestra los elementos en orden FIFO
     public void mostrar(){
        if (estaVacia()){
            System.out.println("La cola esta vacia");
            return;//ya no hace nada de lo de abajo
        }
        System.out.println("Fila actual: ");
        for (int i = frente; i <= fin; i++ ){//desde el inicio de la fila hasta el final
            System.out.println(arreglo[i] + " ");//imprimimos el arreglo
        }
        System.out.println();
     }

     //devuelve la cantidad actual de elementos
    public int contarElementos(){
        return tamanio;
    }
}

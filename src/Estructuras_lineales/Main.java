package Estructuras_lineales;

public class Main {
    public static void main (String[] args) {
        //creamos nuestra pila vacia usando el constructor
        PilaDinamica miPila = new PilaDinamica();

        //1. probamos isEmpty
        System.out.println(" ==== Comprobamos si la pila esta vacia ===");
        //como no hemos insertado elementos, debe devolver true
        System.out.println("La pila esta vacia? " + miPila.isEmpty());

        //2. insertar los elementos con push
        System.out.println("\n=== INSERTANDO ELEMENTOS (PUSH) ===");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);

        //3. mostramos los elementos
        System.out.println("\n=== MOSTRANDO LA PILA ===");
        // El orden será 30, 20, 10 porque el 30 fue
        // el último elemento que insertamos.
        miPila.mostrar();

        // 4. CONSULTAR LA CIMA CON PEEK
        System.out.println("\n=== CONSULTANDO LA CIMA (PEEK) ===");
        // Debe devolver 30 sin eliminarlo.
        System.out.println("Elemento en la cima: " + miPila.peek());
        // Comprobamos que los elementos siguen en la pila.
        miPila.mostrar();

        // 5. EXTRAER UN ELEMENTO CON POP
        System.out.println("\n === SACANDO UN ELEMETO (POP) ===");
        //debe dacar el 30
        miPila.pop(); //deberia sacer el 30
        //mostramos como quedo despues del pop
        miPila.mostrar(); //debe mostrar: 20 10

        // 6. CONSULTAR NUEVAMENTE LA CIMA
        System.out.println("\n=== CONSULTANDO LA NUEVA CIMA ===");
        // Ahora debe devolver 20.
        System.out.println("Elemento en la cima: " + miPila.peek());

        // 7. COMPROBAR ISEMPTY CON ELEMENTOS
        System.out.println("\n=== COMPROBANDO SI LA PILA ESTA VACIA ===");
        // Como todavía quedan elementos, debe devolver false.
        System.out.println("¿La pila esta vacia? " + miPila.isEmpty());

        // 8. VACIAR LA PILA
        System.out.println("\n=== VACIANDO LA PILA ===");
        miPila.pop(); // Saca el 20.
        miPila.pop(); // Saca el 10.

        // 9. COMPROBAR LA PILA VACIA
        System.out.println("\n=== COMPROBACION FINAL ===");
        // Ahora debe devolver true.
        System.out.println("¿La pila esta vacia? " + miPila.isEmpty());
        // Intentamos consultar la cima de una pila vacía.
        miPila.peek();
        // Intentamos extraer un elemento de una pila vacía.
        miPila.pop();
        // Mostramos la pila vacía.
        miPila.mostrar();
    }
}
# Implementación de Pilas Estáticas y Dinámicas en Java

Este proyecto implementa dos tipos de estructuras de datos lineales en Java: una pila estática y una pila dinámica.
Ambas estructuras siguen el principio LIFO (*Last In, First Out*), que significa que el último elemento en entrar es el primero en salir.
El objetivo es comprender cómo funcionan las pilas, cómo se insertan y extraen elementos, 
y cuáles son las diferencias entre almacenar información en un arreglo y hacerlo mediante nodos enlazados.

## 1. Estructura del proyecto

El proyecto está organizado en el paquete `Estructuras_lineales` y contiene las siguientes clases:

```text
Estructuras_lineales/
├── PilaSimple.java
├── LanzadorPilaSimple.java
├── PilaDinamica.java
├── Nodo.java
└── Main.java
```

### Descripción de las clases

- **PilaSimple.java:** implementa una pila estática mediante un arreglo de cinco posiciones.
- **LanzadorPilaSimple.java:** contiene el método `main` para probar la pila estática.
- **PilaDinamica.java:** implementa una pila dinámica mediante nodos enlazados.
- **Nodo.java:** representa cada nodo de la pila dinámica. Almacena un dato entero y una referencia al siguiente nodo.
- **Main.java:** contiene el método `main` para probar la pila dinámica.

## 2. Diferencias entre la pila estática y la dinámica

### Pila estática

La pila estática utiliza un arreglo de tamaño fijo para almacenar sus elementos.

En esta implementación se utiliza:

```java
int[] datos = new int[5];
int tope = -1;
```

El arreglo tiene una capacidad máxima de cinco elementos. La variable `tope` indica la posición del último elemento insertado.
Cuando la pila está vacía, `tope` vale `-1`. Cuando está llena, `tope` vale `4`, porque los índices del arreglo van desde `0` hasta `4`.
Si se intenta insertar un elemento cuando la pila está llena, se muestra un mensaje de error.

### Pila dinámica

La pila dinámica utiliza nodos enlazados para almacenar sus elementos.
Cada nodo contiene un dato y una referencia al siguiente nodo:

```java
int dato;
Nodo siguiente;
```

La variable `cima` apunta al nodo que se encuentra en la parte superior de la pila.
Cuando la pila está vacía, `cima` vale `null`.
A diferencia de la pila estática, la pila dinámica no tiene una capacidad máxima establecida mediante un arreglo. Puede crecer mientras haya memoria disponible, aunque la creación de nuevos nodos está limitada por los recursos del sistema.

### Comparación

| Característica | Pila estática | Pila dinámica |
|---|---|---|
| Almacenamiento | Arreglo | Nodos enlazados |
| Capacidad | Fija: 5 elementos | Variable, según la memoria disponible |
| Control de la cima | Variable `tope` | Referencia `cima` |
| Pila vacía | `tope == -1` | `cima == null` |
| Inserción | Guarda el dato en una posición del arreglo | Crea un nodo y lo enlaza |
| Extracción | Decrementa el valor de `tope` | Actualiza `cima` al siguiente nodo |
| Verificación de pila vacía | `isEmpty()` | `isEmpty()` |
| Consulta de la cima | `peek()` | `peek()` |
| Verificación de pila llena | `isFull()` | No se implementa en este proyecto |

En conclusión, la pila estática tiene una capacidad definida desde su creación, mientras que la pila dinámica administra sus elementos mediante referencias entre nodos.

## 3. Métodos implementados

Ambas pilas cuentan con los métodos necesarios para insertar, extraer, mostrar y consultar elementos.

| Método | Descripción |
|---|---|
| `push(int x)` | Inserta un elemento en la cima de la pila. |
| `pop()` | Extrae el elemento que se encuentra en la cima. |
| `mostrar()` | Recorre e imprime los elementos de la pila. |
| `isEmpty()` | Comprueba si la pila está vacía. |
| `peek()` | Consulta el elemento de la cima sin eliminarlo. |
| `isFull()` | Comprueba si la pila está llena. Solo se utiliza en la pila estática. |

### Funcionamiento de `push()`

Inserta un elemento en la cima de la pila.

Por ejemplo, al ejecutar:

```java
p.push(10);
p.push(20);
p.push(30);
```

La pila queda de la siguiente manera:

```text
    TOPE
     |
     v
   +----+
   | 30 |
   +----+
   | 20 |
   +----+
   | 10 |
   +----+
```

### Funcionamiento de `pop()`

Extrae el elemento que se encuentra en la cima.

Si ejecutamos:

```java
p.pop();
```

Se elimina el elemento `30`, por lo que la pila queda con los elementos `20` y `10`.

### Funcionamiento de `mostrar()`

Imprime los elementos almacenados en la pila, comenzando por la cima y continuando hasta el fondo.

### Funcionamiento de `isEmpty()`

Devuelve `true` cuando la pila está vacía y `false` cuando contiene elementos.

En la pila estática se comprueba si `tope == -1`.

En la pila dinámica se comprueba si `cima == null`.

### Funcionamiento de `peek()`

Devuelve el elemento de la cima sin eliminarlo ni modificar la estructura de la pila.
Si la pila está vacía, los métodos `peek()` de este proyecto muestran un mensaje y devuelven `-1` como indicador de que no hay elementos.

### Funcionamiento de `isFull()`

Este método se utiliza exclusivamente en la pila estática.
Devuelve `true` cuando el arreglo alcanzó su capacidad máxima y `false` cuando todavía tiene espacio disponible.
La pila dinámica no necesita este método en esta actividad porque su capacidad no se establece mediante un arreglo de tamaño fijo.


## 4. Prueba de ejecución de la pila estática

La pila estática tiene una capacidad máxima de cinco elementos.
El siguiente ejemplo corresponde al programa `LanzadorPilaSimple.java` que inserta los elementos `10`, `20` y `30`,
muestra la pila, consulta su cima, extrae un elemento y vuelve a mostrar el contenido.

### Código de prueba

```java
PilaSimple p = new PilaSimple();

p.push(10);
p.push(20);
p.push(30);

p.mostrar();

System.out.println("Elemento en el tope: " + p.peek());

p.pop();

p.mostrar();
```

### Salida esperada por consola

```text
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30
Elemento en el tope: 30
Sacaste: 30
Pila actual: 10 20
```

### Explicación del resultado

1. Se insertan los valores `10`, `20` y `30`.
2. El método `mostrar()` imprime los elementos desde el fondo hasta la cima, porque recorre el arreglo desde el índice `0` hasta `tope`.
3. El método `peek()` consulta el valor `30` sin eliminarlo.
4. El método `pop()` extrae el valor `30`.
5. Finalmente, `mostrar()` imprime los elementos restantes: `10` y `20`.

## 5. Prueba de ejecución de la pila dinámica

La pila dinámica utiliza nodos enlazados y no tiene una capacidad máxima fija definida en el código.
El siguiente ejemplo corresponde al programa `Main.java`.

### Código de prueba

```java
PilaDinamica miPila = new PilaDinamica();

System.out.println("¿La pila esta vacia? " + miPila.isEmpty());

miPila.push(10);
miPila.push(20);
miPila.push(30);

miPila.mostrar();

System.out.println("Elemento en la cima: " + miPila.peek());

miPila.pop();

miPila.mostrar();

System.out.println("¿La pila esta vacia? " + miPila.isEmpty());
```

### Salida esperada por consola

```text
=== COMPROBANDO SI LA PILA ESTA VACIA ===
¿La pila esta vacia? true

=== INSERTANDO ELEMENTOS (PUSH) ===
Metiste: 10
Metiste: 20
Metiste: 30

=== MOSTRANDO LA PILA ===
Pila dinámica (cima -> fondo): 30 20 10

=== CONSULTANDO LA CIMA (PEEK) ===
Elemento en la cima: 30
Pila dinámica (cima -> fondo): 30 20 10

=== SACANDO UN ELEMENTO (POP) ===
Sacaste de la pila: 30
Pila dinámica (cima -> fondo): 20 10

=== CONSULTANDO LA NUEVA CIMA ===
Elemento en la cima: 20

=== COMPROBANDO SI LA PILA ESTA VACIA ===
¿La pila esta vacia? false

=== VACIANDO LA PILA ===
Sacaste de la pila: 20
Sacaste de la pila: 10

=== COMPROBACION FINAL ===
¿La pila esta vacia? true
¡Pila dinámica vacía!
¡Pila dinámica vacía!
Pila dinámica (cima -> fondo):
```

### Explicación del resultado

1. Al crear la pila, `isEmpty()` devuelve `true` porque todavía no hay nodos.
2. Se insertan los valores `10`, `20` y `30`.
3. El método `mostrar()` imprime los elementos desde la cima hasta el fondo: `30 20 10`.
4. El método `peek()` devuelve `30` sin eliminarlo.
5. El método `pop()` extrae el nodo que contiene `30`.
6. La pila queda con los valores `20` y `10`.
7. Se extraen los dos elementos restantes.
8. La pila vuelve a quedar vacía y `isEmpty()` devuelve `true`.
9. Los últimos intentos de consultar y extraer elementos muestran mensajes de pila vacía.

## 6. Conclusión

La implementación de estas dos estructuras permite comprender cómo funciona una pila y cómo se aplica el principio LIFO.
La pila estática almacena los datos en un arreglo de capacidad fija, lo que facilita el acceso mediante índices, 
pero limita la cantidad de elementos que pueden insertarse.
La pila dinámica utiliza nodos enlazados que se crean conforme se insertan elementos. 
Esto permite que la estructura crezca según la memoria disponible y evita establecer una capacidad fija desde el principio.
Ambas implementaciones permiten insertar, extraer, mostrar y consultar elementos, además de verificar si la pila está vacía.
En conclusión, las dos estructuras cumplen la misma función, pero utilizan mecanismos diferentes para administrar la memoria y organizar sus elementos.

## Datos del alumno

Instituto Tecnológico Superior de Xalapa

Sistemas Computacionales 3ro"B"

Estructuras de datos

Víctor Hugo Vásquez Herrera

Tarea1 - unidad 3 -- pilas estáticas y dinámicas en java 

Camila Amor Del Angel Cervantes

08/10/2026

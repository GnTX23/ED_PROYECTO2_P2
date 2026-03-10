
package Estaciones;

public class ColaCiclicaEstaciones {

    static class ColaCircular {

        String[] estaciones;

        int capacidad;
        int frente;
        int fin;
        int cantidad;


        ColaCircular(int capacidad) {
            this.capacidad = capacidad;
            this.estaciones = new String[capacidad]; // creamos el arreglo
            this.frente = 0;   // empezamos desde la posicion 0
            this.fin = 0;      // el fin tambien empieza en 0
            this.cantidad = 0; // al inicio no hay nada en la cola
        }

        boolean estaLlena() {
            return cantidad == capacidad;
        }


        boolean estaVacia() {
            return cantidad == 0;
        }

        void agregar(String estacion) {
            // Primero verificamos si hay espacio
            if (estaLlena()) {
                System.out.println("La cola esta llena, no se puede agregar: " + estacion);
                return; // salimos del metodo sin agregar nada
            }

            // Guardamos la estacion en la posicion "fin"
            estaciones[fin] = estacion;

            // Avanzamos el indice "fin" de forma circular.
            // El operador % hace que cuando lleguemos al ultimo espacio,
            // volvamos al inicio del arreglo (posicion 0)
            fin = (fin + 1) % capacidad;

            // Aumentamos el contador
            cantidad++;

            System.out.println("Estacion agregada: " + estacion);
        }

        String atender() {
            if (estaVacia()) {
                System.out.println("La cola esta vacia, no hay estaciones que atender.");
                return null; // regresamos null porque no hay nada
            }

            // Guardamos el nombre de la estacion del frente
            String estacionAtendida = estaciones[frente];

            // Avanzamos el frente de forma circular
            frente = (frente + 1) % capacidad;

            // Reducimos el contador
            cantidad--;

            return estacionAtendida;
        }

        void rotarEstaciones(String personalApoyo) {
            if (estaVacia()) {
                System.out.println("AVISO: No hay estaciones en la cola.");
                return;
            }

            // Sacamos la estacion del frente
            String estacion = atender();

            // Mostramos quien esta atendiendo esa estacion
            System.out.println(personalApoyo + " fue asignado a: " + estacion);

            // Volvemos a meter la estacion al final (esto crea el ciclo)
            agregar(estacion);
        }

        void mostrarCola() {
            if (estaVacia()) {
                System.out.println("La cola esta vacia.");
                return;
            }

            System.out.print("Cola actual: ");

            // Recorremos las estaciones desde el frente
            for (int i = 0; i < cantidad; i++) {
                // Calculamos la posicion real en el arreglo de forma circular
                int posicion = (frente + i) % capacidad;
                System.out.print("[" + estaciones[posicion] + "]");

                // Ponemos una flecha entre estaciones, menos al final
                if (i < cantidad - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(); // salto de linea al final
        }
    }

    public static void init() {

        System.out.println("Estaciones\n");

        ColaCircular cola = new ColaCircular(3);

        System.out.println("Registrando estaciones");
        cola.agregar("Bebidas");
        cola.agregar("Comida Caliente");
        cola.agregar("Snacks");
        System.out.println();

        System.out.println("Intentando agregar cuando esta llena");
        cola.agregar("Postres"); // esto debe mostrar avso
        System.out.println();

        System.out.println("Estado inicial de la cola");
        cola.mostrarCola();
        System.out.println();

        System.out.println("Asignando personal");
        String[] personal = {"Ana", "Luis", "Maria", "Carlos", "Elena", "Pedro"};

        for (int turno = 0; turno < personal.length; turno++) {
            System.out.println("\nTurno " + (turno + 1) + ":");
            cola.rotarEstaciones(personal[turno]);
            cola.mostrarCola();
        }


        System.out.println("\nVaciando la cola manualmente");
        cola.atender();
        cola.atender();
        cola.atender();


        System.out.println("\nIntentando atender cuando esta vacia");
        cola.atender(); // esto debe mostrar aviso

        System.out.println("\nfin");
    }

    public void mostrarCola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarCola'");
    }

    public void rotarEstaciones(String personal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotarEstaciones'");
    }
}
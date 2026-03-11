package Estaciones;

public class ColaCiclicaEstaciones {

    private String[] estaciones;
    private int capacidad, frente, fin, cantidad;

    public ColaCiclicaEstaciones(int capacidad) {
        this.capacidad = capacidad;
        this.estaciones = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.cantidad = 0;
    }

    public boolean estaLlena() { return cantidad == capacidad; }
    public boolean estaVacia() { return cantidad == 0; }

    public void agregar(String estacion) {
        if (estaLlena()) {
            System.out.println("Cola llena, no se puede agregar: " + estacion);
            return;
        }
        estaciones[fin] = estacion;
        fin = (fin + 1) % capacidad;
        cantidad++;
        System.out.println("Estacion agregada: " + estacion);
    }

    public String atender() {
        if (estaVacia()) {
            System.out.println("Cola vacia, no hay estaciones que atender.");
            return null;
        }
        String estacionAtendida = estaciones[frente];
        frente = (frente + 1) % capacidad;
        cantidad--;
        return estacionAtendida;
    }

    public void rotarEstaciones(String personalApoyo) {
        if (estaVacia()) {
            System.out.println("No hay estaciones en la cola.");
            return;
        }
        String estacion = atender();
        System.out.println(personalApoyo + " fue asignado a: " + estacion);
        agregar(estacion);
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia.");
            return;
        }
        System.out.print("Cola actual: ");
        for (int i = 0; i < cantidad; i++) {
            int posicion = (frente + i) % capacidad;
            System.out.print("[" + estaciones[posicion] + "]");
            if (i < cantidad - 1) System.out.print(" -> ");
        }
        System.out.println();
    }
}
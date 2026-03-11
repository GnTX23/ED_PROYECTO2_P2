import java.util.Scanner;

import Catalogo.ListaEnlazada;
import Catalogo.producto;
import Turnos.FilaDeTurnos;
import Estaciones.ColaCiclicaEstaciones;
import Historial_Pedidos.pedidos;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* ── INICIALIZAR ESTRUCTURAS ── */
        ListaEnlazada catalogo = new ListaEnlazada();
        FilaDeTurnos fila = new FilaDeTurnos();
        ColaCiclicaEstaciones estaciones = new ColaCiclicaEstaciones(3);
        pedidos.pila historial = new pedidos.pila();
        int contadorTurnos = 1;
        int opcion = -1;

        /* ── CARGAR ESTACIONES ── */
        estaciones.agregar("Bebidas");
        estaciones.agregar("Comida Caliente");
        estaciones.agregar("Snacks");

        do {
            System.out.println("\n========================================");
            System.out.println("     SISTEMA CAFETERIA UNIVERSITARIA");
            System.out.println("========================================");
            System.out.println("--- CATALOGO DE PRODUCTOS ---");
            System.out.println(" 1. Agregar producto al inicio");
            System.out.println(" 2. Agregar producto al final");
            System.out.println(" 3. Agregar producto en posicion");
            System.out.println(" 4. Eliminar producto");
            System.out.println(" 5. Mostrar catalogo");
            System.out.println("--- TURNOS DE ATENCION ---");
            System.out.println(" 6. Registrar llegada de cliente");
            System.out.println(" 7. Atender siguiente cliente");
            System.out.println(" 8. Mostrar fila completa");
            System.out.println("--- ESTACIONES DE SERVICIO ---");
            System.out.println(" 9. Rotar estacion");
            System.out.println("--- HISTORIAL DE PEDIDOS ---");
            System.out.println("10. Registrar pedido");
            System.out.println("11. Deshacer ultimo pedido");
            System.out.println("12. Ver pedido en tope");
            System.out.println("13. Ver historial completo");
            System.out.println("----------------------------------------");
            System.out.println(" 0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                /* ══ CATALOGO ══ */
                case 1: {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble(); sc.nextLine();
                    catalogo.insertarInicio(new producto(id, nombre, precio));
                    break;
                }
                case 2: {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble(); sc.nextLine();
                    catalogo.insertarFInal(new producto(id, nombre, precio));
                    break;
                }
                case 3: {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Posicion: ");
                    int posicion = sc.nextInt(); sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble(); sc.nextLine();
                    catalogo.InsertarMedio(new producto(id, nombre, precio), posicion);
                    break;
                }
                case 4: {
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombre = sc.nextLine();
                    catalogo.Eliminar(nombre);
                    break;
                }
                case 5:
                    catalogo.mostrarcatalogo();
                    break;

                /* ══ TURNOS ══ */
                case 6:
                    fila.llegaCliente(contadorTurnos);
                    contadorTurnos++;
                    break;
                case 7:
                    fila.atenderSiguiente();
                    fila.verSiguiente();
                    break;
                case 8:
                    fila.ostrarFila();
                    break;

                /* ══ ESTACIONES ══ */
                case 9: {
                    System.out.print("Nombre del personal: ");
                    String personal = sc.nextLine();
                    estaciones.rotarEstaciones(personal);
                    estaciones.mostrarCola();
                    break;
                }

                /* ══ HISTORIAL ══ */
                case 10: {
                    System.out.print("Nombre del pedido: ");
                    String pedido = sc.nextLine();
                    historial.push(pedido);
                    break;
                }
                case 11:
                    historial.pop();
                    break;
                case 12:
                    historial.peek();
                    break;
                case 13:
                    historial.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema. Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
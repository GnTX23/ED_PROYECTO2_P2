import java.util.Scanner;

import Catalogo.ListaEnlazada;
import Catalogo.producto;
import Estaciones.ColaCiclicaEstaciones;
import Historial_Pedidos.pedidos;
import Turnos.FilaDeTurnos;



public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada Catalogo = new ListaEnlazada();
        FilaDeTurnos fila = new FilaDeTurnos();
        ColaCiclicaEstaciones estaciones = new ColaCiclicaEstaciones();
        pedidos historial = new pedidos();

        int contadorTurnos = 1;
        int opcion = 1;

        /* ── CARGAR ESTACIONES AL INICIO ── */
        estaciones.agregar("Bebidas");
        estaciones.agregar("Comida Caliente");
        estaciones.agregar("Snacks");

        do{
            System.out.println("CATALOGO DE PRODUCTOS");
            System.out.println("1- Agregar producto al inicio");
            System.out.println("2- Agregar producto al final");
            System.out.println("3- Agregar producto a una posición");
            System.out.println("4- Eliminar producto");
            System.out.println("5- Mostrar catálogo");
            System.out.println("--- TURNOS DE ATENCIÓN ---");
            System.out.println("6- Llegada de cliente");
            System.out.println("7- Atender siguiente cliente");
            System.out.println("8- Ver siguiente cliente");
            System.out.println("9- Mostrar fila de turnos");
            System.out.println("--- ESTACIONES DE SERVICIO ---");
            System.out.println("10- Rotar estacion");
            System.out.println("11- Ver estado de estaciones");
            System.out.println("--- HISTORIAL DE PEDIDOS ---");
            System.out.println("12- Registrar pedido");
            System.out.println("13- Deshacer ultimo pedido");
            System.out.println("14- Ver pedido en tope");
            System.out.println("15- Ver historial completo");
            System.out.println("0- Salir");
            System.out.println("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:{
                    System.out.print("id: ");
                    int id = sc.nextInt(); sc.nextLine();
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Precio");
                    Double precio = sc.nextDouble(); sc.nextLine();
                    Catalogo.insertarInicio(new producto(id, nombre, precio));
                    break;
                }
                case 2: {
                    System.out.print("id: ");
                    int id = sc.nextInt(); sc.nextLine();
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Precio");
                    Double precio = sc.nextDouble(); sc.nextLine();
                    Catalogo.insertarFInal(new producto(id, nombre, precio));
                    break;
                }
                case 3: {
                    System.out.print("id: ");
                    int id = sc.nextInt(); sc.nextLine();
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("posicion");
                    int posicion = sc.nextInt(); sc.nextLine();

                    System.out.println("Precio");
                    Double precio = sc.nextDouble(); sc.nextLine();
                    Catalogo.InsertarMedio(new producto(id, nombre, precio), posicion);
                    break;
                }
                case 4: {
                    System.out.println("Nombre del producto a eliminar: ");
                    String nombre = sc.nextLine();
                    Catalogo.Eliminar(nombre);
                    break;
                }
                case 5:{
                    Catalogo.mostrarcatalogo();
                    break;
                }

                /* ══ TURNOS ══ */
                case 6:
                    fila.llegaCliente(contadorTurnos);
                    contadorTurnos++;
                    break;
                case 7:
                    fila.atenderSiguiente();
                    break;
                case 8:
                    fila.verSiguiente();
                    break;
                case 9:
                    fila.ostrarFila();
                    break;

                /* ══ ESTACIONES ══ */
                case 10: {
                    System.out.print("Nombre del personal: ");
                    String personal = sc.nextLine();
                    estaciones.rotarEstaciones(personal);
                    break;
                }
                case 11:
                    estaciones.mostrarCola();
                    break;

                /* ══ HISTORIAL DE PEDIDOS ══ */
                case 12: {
                    System.out.print("Nombre del pedido: ");
                    String pedido = sc.nextLine();
                    historial.push(pedido);
                    break;
                }
                case 13:
                    historial.pop();
                    break;
                case 14:
                    historial.peek();
                    break;
                case 15:
                    historial.mostrarHistorial();
                    break;

                case 0:
                    System.out.println("Gracias por usar este sistema, si nos pone 10 le regalamos un gansito :D");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
        sc.close();
    }
}
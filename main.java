import java.util.Scanner;

import Catalogo.ListaEnlazada;
import Catalogo.producto;
import Turnos.FilaDeTurnos;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ListaEnlazada Catalogo = new ListaEnlazada();
        int opcion = 1;
    


        /*CATÁLOGO DE PRODUCTOS */

     do{
            System.out.println("CATALOGO DE PRODUCTOS");
            System.out.println("1- Agregar producto al inicio");
            System.out.println("2- Agregar producto al final");
            System.out.println("3- Agregar producto a una posición");
            System.out.println("4- Eliminar producto");
            System.out.println("5- Mostrar catálogo");
            System.out.println("6- Salir");
            System.out.println("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); //Se limpia el buffer



           
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
                case 6:{
                    System.out.println("Gracias por usar este sistema, si nos pone 10 le regalamos un gansito :D");
                    break;

                }
                default:{
                    System.out.println("Esta opción es inválida");
                }

            }

        } while (opcion != 0);
        sc.close();


          

        /*TURNOS */
        FilaDeTurnos fila = new FilaDeTurnos(); /*crea una fila vacia */
        System.out.println("Bienvenido al sistema de turnos, por favor ingrese su nombre: ");
        //Llegan 4 clientes WOW 
        fila.llegaCliente(1);
        fila.llegaCliente(2);
        fila.llegaCliente(3);
        fila.llegaCliente(4);

        System.out.println("Ahora, vamos a atender a los clientes: ");
        fila.ostrarFila(); /*Muestra cuantos clientes hay esperando*/
        fila.mostrarEstado(); /*Muestra el siguiente cliente en la fila*/
        fila.verSiguiente(); 

        System.out.println();
        System.out.println("Cajero disponible");
        fila.atenderSiguiente(); /*Atiende al siguiente cliente en la fila*/
        fila.atenderSiguiente(); /*Atiende al siguiente cliente en la fila*/

        System.out.println();
        fila.ostrarFila();
        fila.mostrarEstado();



    }    
    
    
}


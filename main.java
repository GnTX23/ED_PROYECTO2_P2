import java.util.Scanner;

import Catalogo.ListaEnlazada;
import Catalogo.producto;

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
                    Double precio = sc.nextDouble(); sc.nextLine()
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

                

            }

        }
    }        
}

import java.util.Scanner;

import Catalogo.ListaEnlazada;
import Catalogo.producto;
import Turnos.FilaDeTurnos;
import Estaciones.ColaCiclicaEstaciones;

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
        int opcionTurnos =0;
        int contadorTurnos = 1; //para asignar un numero de turno a cada cliente que llegue, se inicia en 1 y se incrementa cada vez que llega un nuevo cliente.
        
        do {
            System.out.println("SISTEMA DE TURNOS");
            System.out.println("1- Llegada de cliente");
            System.out.println("2- Atender siguiente cliente");
            System.out.println("3- Ver siguiente cliente");
            System.out.println("4- Mostrar fila de turnos");
            System.out.println("5- Salir");
            System.out.println("Elige una opción: ");
            opcionTurnos = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcionTurnos) {
                case 1:
                    fila.llegaCliente(contadorTurnos);
                    contadorTurnos++;
                    break;
                case 2:
                    fila.atenderSiguiente();
                    break;
                case 3:
                    fila.verSiguiente();
                    break;
                case 4:
                    fila.ostrarFila();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema de turnos, si nos pone 10 le regalamos un gansito :D");
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige una opción del 1 al 5.");
            }
        } while (opcionTurnos != 5);

        /*ESTACIONES*/
        if (opcion == 10){
            ColaCiclicaEstaciones cce = new ColaCiclicaEstaciones();
            cce.init();
        }


        do{
            System.out,println("Agregar pedido")
             System.out,println("Eliminar pedido")
              System.out,println("Ver pedido")
               System.out,println("volver")

               opcionTurnos = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch(opcionPedidos){
                case 1: 
         if (tope == max){
             System.out.println(null, "La pila de pedidos esta llena");
            else{
               tope++;
               v[tope]=Byte.parseByte(System.out.println("Digite el numero del pedido"));
               pila.push(nuevoPedido); //Insertar ultimo elemento al tope de la lista      //metodo push
               System.out.println(null, "Pedido agregado" + v[tope]);

            }
            brak;
         case 2:
         if (!pila.isEmpty()){
            System.out.println(null, "La pila de pedidos esta vacia");
         }else{
            pila.Pop();                                 //metodo pop
            System.out.println(pila.peek());             //Elimina el pedido al frente de la pila pero lo ree escribe en consola para tenerlo en "historial"
            i++;                                          //se agrega ese propucto eliminado a consola
            System.out.println(null, "Pedido eliminado" + v[tope]);
            tope--;
         }
         break;
         case 3:
         if (!pila.isEmpty()){
            System.out.println(null, "La pila de pedidos esta vacia");
         }else{
            String pedidos="";
            for(i=tope; i>=0; i--){
               pedidos+=v[i] + "\n";
            }
            System.out.println(null, "Pedidos en la pila:\n" + pedidos);
         }
         break;
         case 4:
         System.out.println(null, "Volviendo al menu principal");
         break;
      }
      default:{
                    System.out.println("Esta opción es inválida");
                }
            }
        }

    }    
    
    
}


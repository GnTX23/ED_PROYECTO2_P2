package Historial_Pedidos;
import java.util.Stack;
import java.util.Scanner;


 public class pedidos{
 public static void main (String args[]){
    Stack<String> pila = new Stack<>();
    byte max=9, op=0;
    int tope=-1, i=0;

    byte v[] = new byte[10];
    while(op!=4){
      op=Byte.parseByte(System.out.println("Digite un numero\n"+"1.Agregar pedido\n2.Deshacer ultimo pedido\n3.Ver pedidos\n4.Volver"));
      switch(op){
         case 1: 
         if (tope == max){
             System.out.println(null, "La pila de pedidos esta llena");
            else{
               tope++;
               v[tope]=Byte.parseByte(System.out.println("Digite el numero del pedido"));
               pila.push(nuevoPedido); //Insertar ultimo elemento al tope de la lista      //metodo push
               System.out.println(null, "Pedido agregado" + v[tope]);

            }
            break;
         case 2:{
         if (!pila.isEmpty()){
            System.out.println(null, "La pila de pedidos esta vacia");
            
         }
         
         else{
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
   }
 }
 }
       }

 public void pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
 }

 public void peek() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
 }

 public void mostrarHistorial() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mostrarHistorial'");
 }

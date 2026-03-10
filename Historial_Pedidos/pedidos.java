 /*3. Historial de Pedidos Recientes
El sistema debe registrar los últimos pedidos procesados en cada caja utilizando una pila. Esto permite al
cajero deshacer el último pedido en caso de error, operación por operación. Las operaciones básicas con
pilas incluyen: consultar el pedido en el tope, verificar si la pila está vacía antes de extraer, e insertar
nuevos pedidos, considerando el caso especial de inserción en una pila vacía al iniciar el turno de cada
cajero. */
 public class pedidos{
 public static void main (String args[]){
    byte max=9, op=0;
    int tope=-1, i=0;

    byte v[] = new byte[10];
    while(op!=4){
      op=Byte.parseByte(JOptionPane.showInputDialog("Digite un numero\n"+"1.Agregar pedido\n2.Deshaser ultimo pedido\n3.Ver pedidos\n4.Volver"));
      switch(op){
         case 1: 
         if (tope == max){
             JOptionPane.showMessageDialog(null, "La pila de pedidos esta llena");
            else{
               tope++;
               v[tope]=Byte.parseByte(JOptionPane.showInputDialog("Digite el numero del pedido"));
               JOptionPane.showMessageDialog(null, "Pedido agregado" + v[tope]);
            }
            brak;
         case 2:
         if (tope==-1){
            JOptionPane.showMessageDialog(null, "La pila de pedidos esta vacia");
         }else{
            JOptionPane.showMessageDialog(null, "Pedido eliminado" + v[tope]);
            tope--;
         }
         break;
         case 3:
         if (tope==-1){
            JOptionPane.showMessageDialog(null, "La pila de pedidos esta vacia");
         }else{
            String pedidos="";
            for(i=tope; i>=0; i--){
               pedidos+=v[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "Pedidos en la pila:\n" + pedidos);
         }
         break;
         case 4:
         JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
         break;
      }
   }
 }
 }
 }

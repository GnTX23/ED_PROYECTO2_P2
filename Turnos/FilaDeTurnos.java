package Turnos;

public class FilaDeTurnos {
    Turnos primer; /*El primer cliente en la fila*/
    Turnos ultimo;/*El ultimo cliente en la fila*/
    int totalEsperando;/*Cunatos clientes hay en la fila*/

    /*Inicia con la fila vacia */
    public FilaDeTurnos(){ 
        this.primer = null;
        this.ultimo = null;
        this.totalEsperando = 0;
    }
    /*Comprobamos que la fila este vacia */
    public boolean estaVacia(){
        return primer == null;/*si no hay nadie en primero o al frente, es porque si, esta vacia */
     }
    
     /*Al llegar un cliente, ira al final de la fila */
     public void llegaCliente(int numeroTurno){
        Turnos nuevoTurnos = new Turnos(numeroTurno); /*Creamos un nuevo cliente con el numero de turno que se le asigna*/
        if (estaVacia()){
            /*Si la fila esta vacia, el cliente ira al frente */
            primer = nuevoTurnos;
            ultimo = nuevoTurnos;
        } else{
            /*Si ya hay gente, el cliente ira al final */
            ultimo.siguiente = nuevoTurnos; 
            ultimo = nuevoTurnos;
        }
        totalEsperando++; /*aumenta el contador */
        System.out.println("Llego el cliente con turno numero: " + numeroTurno);
       
     }

}

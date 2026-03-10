public class Turnos{
    int numeroTurno; //Numero de turno del cliente
    Turnos siguiente; //Apunta al siguiente cliente
 //Aquie es e constructor de la clase Turnos, que inicializa el numero de turno y establece el siguiente turno como null
    public Turnos(int numeroTurno){ 
        this.numeroTurno = numeroTurno; //this = este cliente en especifico 
        this.siguiente = null;
    }
}

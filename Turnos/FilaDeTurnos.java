package Turnos; /* el package es para organizar las clases*/

public class FilaDeTurnos { /*se crea la clase FilaDeTurnos,todo esto es para definir los datos */
    Turnos primer; /*El primer cliente en la fila, esto es para identificarlo claramente */
    Turnos ultimo;//*El ultimo cliente en la fila, La fila necesita saber quien esta al frente y quien esta atras */
    int totalEsperando;/*Cunatos clientes hay en la fila*/

    /*Inicia con la fila vacia */
    public FilaDeTurnos(){  /*Se crea un constructor que se utiliza para inicializar la fila */
        this.primer = null; 
        this.ultimo = null;
        this.totalEsperando = 0;/*Dado a que al dari comienzo, la fila empieza vacia */
    }

    /*Comprobamos que la fila este vacia */
    public boolean estaVacia(){ /*Utilizamos boolean para regresar un tru o false,si primero es null es que esta la fila vacia,más que nada se utilizara para evitar errores al dar comienzo :D */
        return primer == null;/*si no hay nadie en primero o al frente, es porque si, efectivamente esta vacia :V*/
     }
    
     /*Al llegar un cliente, ira al final de la fila */
     public void llegaCliente(int numeroTurno){ //Cuando llega un cliente, se le asigna un numero de turno, y se agrega al final de la fila. El numero de turno es un entero que se le asigna a cada cliente para identificar su orden en la fila. Este metodo se encarga de agregar al nuevo cliente al final de la fila y actualizar el contador de clientes esperando.*/
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
        totalEsperando++; /* se utilizara para aumenta el contador */
        System.out.println("Llego el cliente con turno numero: " + numeroTurno); /*El System.out imprime el mensaje */
       /*¿por que estudio esto?*/
     }

     /*Ahora, procederemos al cajero libre, cuando una caja este disponible, signofica que podra atender a un nuevo cliente AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH! */
     public void atenderSiguiente(){
        if(estaVacia()){
            System.out.println("No hay clientes esperando.");
            return; /*si no hay clientes, pue sno se piuede atender a nadie*/
        }
        int turnoAtentido = primer.numeroTurno; /*Guardamos el numero de turno del cliente que se va a atender*/
        primer = primer.siguiente; /*El siguiente cliente se convierte en el nuevo primero*/
        /*Si ya no llega a haber nadie, el ultimo tambien es null */
        if (primer == null){
            ultimo = null;
        }
        totalEsperando--; /*Disminuye el contador de clientes esperando*/
        System.out.println("Atendiendo al cliente con turno numero: " + turnoAtentido);
     }
     /*Ahora vamos a revisar el siguiente en la fila */
        public void verSiguiente(){
            if(estaVacia()){
                System.out.println("No hay clientes esperando.");
            } else {
                System.out.println("El siguiente cliente en la fila tiene el turno numero: " + primer.numeroTurno);
            }
     }
        /*Y por ultimo, vamos a revisar cuantos clientes hay esperando */
        public void ostrarFila(){
            if(estaVacia()){
                System.out.println("No hay clientes esperando.");
            return;
            }
            System.out.println("Clientes esperando en la fila:");
            Turnos actual = primer; /*Empezamos desde el primer cliente*/
            while(actual != null){ /*Mientras haya clientes en la fila */
                System.out.println(" - Turno: #" + actual.numeroTurno);
                actual = actual.siguiente;
            }
            System.out.println("FINAL DE LA FILA");
        }

       
}
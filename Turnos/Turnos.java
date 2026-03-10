package Turnos; /*Esta wea no me quedo claro para que es, a lo que entendi, el package es para organizar las clases */
public class Turnos{ /*El public class Turnos{ es para crear una clase llamada turnos, public se usa para que la clase sea accesible desde otras clases */
    int numeroTurno; /*Numero de turno del cliente, es un entero porque es un numero, y se llama numeroTurno para identificarlo claramente */
    Turnos siguiente; /*Apunta al siguiente cliente, es una referencia a otra instancia de la clase Turnos */

 //Aquie es e constructor de la clase Turnos, que inicializa el numero de turno y establece el siguiente turno como null
    public Turnos(int numeroTurno){ /*Es para inicializar el numero de turno */
        this.numeroTurno = numeroTurno; /*this = este cliente en especifico|| Y numeroTurno es el parametro que se le pasa al constructor para asignar el numero de turno a este cliente */
        this.siguiente = null;/*this.siguiente = null; es para indicar que el siguiente turno no existe aún, es decir, que este cliente es el último en la fila */
    }
}

/*Un parámetro en programación es una variable especial utilizada en una función o método para recibir datos de entrada */
/*Una clase es un molde o plantilla para crear objetos, que tienen propiedades y comportamientos específicos */
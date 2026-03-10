package Catalogo;

public class producto {
    
    /* ATRIBUTOS */
    private int id;
    private String nombre;
    private double precio;
    public producto siguiente;
        

        /*Se crea el constructor en base a los atributos */
    public producto (int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /*GETTERS */ 
    /* Con ellos se pueden obtener para hacer una operacion, mostrarlos en pantalla...*/
    public int Getid()  {
        return id;
    }
    public String Getnombre()  {
        return nombre;
    }

    public double Getprecio() {
        return precio;
    }    

        
    
    /*SETTERS */
    /*Se pueden establecer valores a los getters */
    /*en este caso, se lo aplicamos solo a precio, ya que puede llegar a cambiar */

    public void Setprecio(double precio){
        this.precio =precio;
    }


    @Override
    public String toString(){
      return "id: " + id + "  producto: " + nombre + " Precio: $" + precio;
    }
}
   

    
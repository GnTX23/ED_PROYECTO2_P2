public class Productos {
    public static void main(String[] args) {
        System.out.println("Bienvenido al catálogo de productos");

        /* ATRIBUTOS */
        private int id;
        private String nombre;
        private double precio;

        public Productos (int id, String nombre, double precio){
            this.id = id;
            this. nombre = nombre;
            this. precio = precio;
        }
            
        @override 
        public String Tostring{
            return "id: " + id + ", nombre: " + nombre + ", precio: " + precio;
        }
    }
}    

    
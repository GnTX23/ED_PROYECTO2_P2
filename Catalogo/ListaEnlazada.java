package Catalogo;

public class ListaEnlazada {
    /*ATRIBUTO */
    private producto head;

    /*CONSTRUCTOR */
    public ListaEnlazada(){
        this.head = null;
    }

    /*Si está vacío... */
    public boolean IsEmpty(){
        return head == null;
    }    

    /*Para insertar al inicio */
    public void insertarInicio(producto producto ){
        producto.siguiente = head;
        head = producto;
        System.out.println("Se agregó tu producto al inicio: " + producto.Getnombre());

    }

    /*Para insertar al final */
    public void insertarFInal (producto producto){
        if (IsEmpty()) {
            head = producto;
        }
        else{
            producto actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = producto; 
        }
        System.out.println("Se agregó tu producto al final: "+ producto.Getnombre());

    }

    /*Para insertar en medio */
    public void InsertarMedio (producto producto, int posicion){
        if (posicion <= 0){
            insertarInicio(producto);
            return;
        }

        producto actual = head;
        int indice = 0;

        while (actual != null && indice < posicion - 1) {
            actual = actual.siguiente;
            indice++;
        }
        if (actual == null){
            insertarFInal(producto);
        }
        else{
            producto.siguiente = actual.siguiente;
            actual.siguiente = producto;
            System.out.println("Se insertó tu producto a la posición: " + posicion +":" + producto.Getnombre());

        }

    }


    /*ELIMINAR POR NOMBRE */

    /*para lista vacia */
    public void Eliminar (String nombre){
        if (IsEmpty()){
            System.out.println("El catálogo está vacío");
        return;
        }
    

      /*para elimnar head  */
        if (head.Getnombre().equalsIgnoreCase(nombre)){
            head = head.siguiente;
            System.out.println("producto eliminado");
            return;
        }

        /*eliminar en medio o al final */
        producto anterior = head;
        producto actual = head.siguiente;

        while (actual != null){
            if (actual.Getnombre().equalsIgnoreCase(nombre)){
                anterior.siguiente = actual.siguiente;
                System.out.println("Producto eliminado");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;

        }

        /*si no se encuentra el producto */
        System.out.println("No se encontró el producto");


    }
      
    /*MOSTRAR CATÁLOGO PARA JOPTIONSPAGE*/ 
      public void mostrarcatalogo(){
        if (IsEmpty()){
            System.out.println("El catálogo está vacío");
            return;
        }

        System.out.println("CATALOGO DE PRODUCTOS");
        producto actual = head;
        int posicion =1 ;

        while (actual != null);
        System.out.println(posicion + "." + actual);
        actual = actual.siguiente;
        posicion++;
    }


}


package Historial_Pedidos;

public class pedidos {

    /* NODO */
    static class Nodo {
        String producto;
        Nodo proximo;

        Nodo(String producto) {
            this.producto = producto;
            this.proximo = null;
        }
    }

    /* PILA */
    public static class pila {
        int pedido;
        Nodo limite;

        public pila() {
            this.pedido = 0;
            this.limite = null;
        }

        public boolean isEmpty() {
            return limite == null;
        }

        public void push(String producto) {
            Nodo nuevo = new Nodo(producto);
            if (isEmpty()) {
                limite = nuevo;
            } else {
                nuevo.proximo = limite;
                limite = nuevo;
            }
            pedido++;
            System.out.println("Producto agregado: " + producto);
        }

        public String pop() {
            if (isEmpty()) {
                System.out.println("No hay productos en la pila.");
                return null;
            }
            String productoEliminado = limite.producto;
            limite = limite.proximo;
            pedido--;
            System.out.println("Producto eliminado: " + productoEliminado);
            return productoEliminado;
        }

        public String peek() {
            if (isEmpty()) {
                System.out.println("No hay productos en la pila.");
                return null;
            }
            System.out.println("Producto en tope: " + limite.producto);
            return limite.producto;
        }

        public void mostrar() {
            if (isEmpty()) {
                System.out.println("Historial de pedidos vacio.");
                return;
            }
            System.out.println("Historial de pedidos:");
            Nodo actual = limite;
            int contador = 1;
            while (actual != null) {
                System.out.println(" " + contador + ". " + actual.producto);
                actual = actual.proximo;
                contador++;
            }
            System.out.println("Total de pedidos: " + pedido);
        }
    }
}
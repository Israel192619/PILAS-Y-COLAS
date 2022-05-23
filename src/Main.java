import lse.Lista_SE;
import pc.Cola;
import pc.Pila;

public class Main {
    public static void main(String[] args) {
        /*
        Lista_SE listp = new Lista_SE();
        System.out.println(listp.estavacio());

        //insertar elementos
        listp.insertarInicio(5);
        listp.insertarInicio(6);
        listp.insertarInicio(9);
        listp.insertarInicio(8);
        listp.insertarInicio("CUEVAS");
        listp.insertarInicio("ZABALA");
        listp.insertarInicio("ISRAEL");
        //mostramos nuestra lista
        listp.mostrar();

        //eliminamos
        listp.eliminarInicio();
        listp.eliminarInicio();
        //mostramos nuestra lista
        listp.mostrar();




        /*
        ListaDoblementeEnlazada ListaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(ListaDoblementeEnlazada.estaVacio());
        for (int i = 20; i > 0; i--) {
            ListaDoblementeEnlazada.insertar(i);
        }
        System.out.println(ListaDoblementeEnlazada.estaVacio());
        ListaDoblementeEnlazada.mostrarAdelante();
        ListaDoblementeEnlazada.eliminar();
        ListaDoblementeEnlazada.eliminar();
        ListaDoblementeEnlazada.mostrarAdelante();
        ListaDoblementeEnlazada.mostrarAtras();
        */

        /*
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacio());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());
        //reloj ejemplo
        for (int i = 1; i <= 12; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);
        }
        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());
        /*listaCircularSimplementeEnlazada.eliminarFin();
        listaCircularSimplementeEnlazada.eliminarFin();
        listaCircularSimplementeEnlazada.mostrar();
         */
/*
        listaCircularSimplementeEnlazada.mostraCircular(2);

 */
/*
        Cola cola = new Cola();
        System.out.println(cola.estavacio());

        for (int i = 1; i <= 5 ; i++) {
            cola.insertarInicio(i);
        }
        cola.mostrar();

        cola.eliminarInicio();
        cola.eliminarInicio();
        cola.mostrar();
 */
        Pila pila = new Pila();
        System.out.println(pila.estavacio());

        for (int i = 1; i <= 5 ; i++) {
            pila.insertarInicio(i);
        }
        pila.mostrar();

        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.eliminarInicio();
        pila.mostrar();
    }
}

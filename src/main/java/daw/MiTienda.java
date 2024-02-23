/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author daniel
 */
public class MiTienda {

    public static void main(String[] args) {
        //creamos una lista de tipo producto 
        List<Producto> productos = new ArrayList<>();

        //creamos dos objetos de los productos diferentes que tenemos
        Pantalon p1 = new Pantalon(37, "Gucci", 1234,
                5000.00, 0.23, "Camisa Blanca");
        Pantalon p2 = new Pantalon(40, "Versacce", 5678,
                10000.00, 0.23, "Pulsera");
        Musica m1 = new Musica("EV", 2312, 12, 0.12,
                "Grupo Musical Rock");
        Musica m2 = new Musica("The Beattle", 2834, 8,
                0.12, "Musicote");
        LibroPapel lp1 = new LibroPapel(300, "ES12",
                0000, 5.0, 0.45, "Libro paper");
        LibroPapel lp2 = new LibroPapel(100, "ES13",
                0001, 9.0, 0.45, "Libro paper small");
        LibroDigital ld1 = new LibroDigital(1000, "ES14", 1209,
                3.00, 0.1, "Libro Digital 1");
        LibroDigital ld2 = new LibroDigital(10000, "ES15", 1210,
                5.00, 0.1, "Libro Digital 2");

        //añadimos a la lista de productos 
        //al añadir a la lista estamos haciendo conversiones implícitas
        productos.add(p1);
        productos.add(p2);
        productos.add(m1);
        productos.add(m2);
        productos.add(lp1);
        productos.add(lp2);
        productos.add(ld1);
        productos.add(ld2);

        System.out.println("Actividad 2:\n");

        //vamos a mostras los datos de la lista usando un for each
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nActividad 3:\n");

        //hacemos el criterio para ordenar el prodcuto por precio
        Comparator<Producto> compararPorPrecio
                = (pc1, pc2) -> Double.compare(pc1.getPrecio(), pc2.getPrecio());

        //ordenamos la lista por el criterio anterior
        productos.sort(compararPorPrecio);

        //mostramos la lista de nuevo haciendo un for each
        System.out.println();
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nActividad 4:\n");

        //hacemos el criterio para ordenar el prodcuto por códgio
        Comparator<Producto> compararPorCodigo
                = (pc1, pc2) -> Integer.compare(pc1.getCodigo(), pc2.getCodigo());

        //ordenamos la lis por el criterio anterior
        productos.sort(compararPorCodigo);

        //mostramos la lista de nuevo haciendo un for each
        System.out.println();
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nActividad 5:\n");

        //Búsqueda binaria
        //lo primero de todo es crear el objeto a buscar de forma vacía
        Pantalon pantPrueba = new Pantalon();
        //a ese mismo objeto le hacemos un set del codigo que queremos buscar
        pantPrueba.setCodigo(1234);
        //creamos un int de posción que igualará al binarySearch
        int posicion = Collections.binarySearch(productos, pantPrueba,
                compararPorCodigo);
        //mostramos por pantalla la posición que ha encontrado
        //en el caso de que no encontrase nada devolvería un negativo
        System.out.println(posicion);

        System.out.println("\nActividad 6:\n");

        //creamos una lista de tipo libros
        List<Libro> listaLibro = new ArrayList<>();

        //hacemos un foreach para recorrer la lista
        for (Producto prod : productos) {
            //hacemos un instanceof para que en el caso de que el objeto
            //prod sea de tipo libro se guarde la listaLibro
            if (prod instanceof Libro) {
                //hacemos un casting explícito para guardar en la lista de tipo
                //libro
                listaLibro.add((Libro) prod);
                System.out.println("Añadiendo a la lista de libros el libro " + prod);
            }
        }

        System.out.println("\nActividad 7:\n");

        //creamos el objeto iterator de tipo libro
        Iterator<Libro> it = listaLibro.iterator();
        //bucle para que recorrer el anterior iterator
        while (it.hasNext()) {
            //mientras haya un siguiente se mostrará el objeto
            System.out.println(it.next());
        }

        System.out.println("\nActividad 8:\n");

        //Al haber implementado en la clase libro el comparable
        //y decirle el criterio de ordenación, solo debemos hacer el 
        //Colecction.sort(listaLibro)
        Collections.sort(listaLibro);
        //for each de libro para ir recorriendo la lista de libro
        for (Libro libro : listaLibro) {
            //mostramos cada libro (esto hace un casting implícito)
            System.out.println(libro);
        }

        System.out.println("\nActividad 9:\n");

        //recorremos la lista de libros con for each
        for (Libro libro : listaLibro) {
            //queremos ejecutar los métodos enviar() o descargar() dependiendo
            //del tipo de libro que sea, para eso usaremos un instanceof
            //En el caso de que sea LibroPapel:
            if (libro instanceof LibroPapel) {
                //aquí debemos hacer casting explícito para poder usar el
                //método propio
                ((LibroPapel) libro).enviar("Calle Tijuana");
            }
            //En el caso de que sea LibroDigital:
            if (libro instanceof LibroDigital) {
                //aquí debemos hacer casting explícito para poder usar el
                //método propio
                ((LibroDigital) libro).descarga();
            }
        }

        System.out.println("\nActividad 11:\n");

        if (listaLibro.contains(ld1)) {
            System.out.println("La lista contiene el libro " + ld1.getDescripcion());
        }

        System.out.println("\nActividad 12 y 13:\n");

        //creamos la lista con los objetos que se envían
        List<SeEnvia> listaSeEnvia = new ArrayList<>();

        //hacemos un for each de la lista de productos
        for (Producto prod : productos) {
            //con el instanceof miramos si el prod es de tipo SeEnvia
            if (prod instanceof SeEnvia) {
                //si es de tipo SeEnvia se añade a la listaSeEnvia
                //haciendo un casting explícito
                listaSeEnvia.add((SeEnvia) prod);
            }
        }

        //recorremos la lista de la interfaz
        for (SeEnvia se : listaSeEnvia) {
            //ejecutamos el método propio de la interfaz con la dirección
            //igual para todos
            se.enviar("Madrid 33");
        }
        
        System.out.println("\nActividad 14:\n");
        
        //Vamos a implementar en el main el método nuevo creado en libro
        //y que tiene diferente código en las clases hijas
        for (Libro lib : listaLibro) {
            if (lib instanceof LibroPapel) {
                //aquí estamos haciento conversiones implícitas
                lib.caratula();
            }
            if (lib instanceof LibroDigital) {
                //aquí estamos haciento conversiones implícitas
                lib.caratula();
            }
        }
    }
}

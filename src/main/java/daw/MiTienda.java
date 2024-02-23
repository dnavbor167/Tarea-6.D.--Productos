/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        
        //vamos a mostras los datos de la lista usando un for each
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        //hacemos el criterio para ordenar el prodcuto por precio
        Comparator<Producto> compararPorPrecio = 
                (pc1,pc2)->Double.compare(pc1.getPrecio(),pc2.getPrecio());
        
        //ordenamos la lista por el criterio anterior
        productos.sort(compararPorPrecio);
        
        //mostramos la lista de nuevo haciendo un for each
        System.out.println();
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        //hacemos el criterio para ordenar el prodcuto por códgio
        Comparator<Producto> compararPorCodigo = 
                (pc1,pc2)->Integer.compare(pc1.getCodigo(), pc2.getCodigo());
        
        //ordenamos la lis por el criterio anterior
        productos.sort(compararPorCodigo);
        
        //mostramos la lista de nuevo haciendo un for each
        System.out.println();
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        //Búsqueda binaria
        //lo primero de todo es crear el objeto a buscar de forma vacía
        Pantalon pantPrueba = new Pantalon();
        //a ese mismo objeto le hacemos un set del codigo que queremos buscar
        pantPrueba.setCodigo(1234);
        //creamos un int de posción que igualará al binarySearch
        int posicion = Collections.binarySearch(productos, pantPrueba, 
                compararPorCodigo);
        System.out.println(posicion);
    }
}

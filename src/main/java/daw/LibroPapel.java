/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
final public class LibroPapel extends Libro implements SeEnvia{
    //insertamos atributos encapsulados
    private int numPaginas;
    
    //insertamos constructores
    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }
    public LibroPapel() {
    }
    
    //insertamos getter y setter
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //insertamos toString
    @Override
    public String toString() {
        return super.toString() + " LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }
    
    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando articulo de Libro de papel " + 
                this.toString() + ", en la dirección: " + direccion);
    }
    
}

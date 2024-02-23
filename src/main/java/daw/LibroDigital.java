/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
final public class LibroDigital extends Libro implements SeDescarga{
    //insertamos atributos encapsulados
    private int numKBytes;
    
    //insertamos constructores
    public LibroDigital(int numKBytes, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }
    public LibroDigital() {
    }
    
    //insertamos getter y setter
    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(short numKBytes) {
        this.numKBytes = numKBytes;
    }
    
    //insertamos toString
    
    @Override
    public String toString() {
        return super.toString() + " LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descarga() {
        System.out.println("https://Daniel.daw/" + this.hashCode());
    }
}

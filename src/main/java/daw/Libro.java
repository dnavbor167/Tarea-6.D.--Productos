/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    //insertamos atributos encapsulados
    private String isbn;
    
    //insertamos constructores
    public Libro(String isbn, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }
    public Libro() {
    }
    
    //insertamos getter
    public String getIsbn() {
        return isbn;
    }
    
    //insertamos toString

    @Override
    public String toString() {
        return super.toString() + " Libro{" + "isbn=" + isbn + '}';
    }
    
    
    //insertamos equal y hashcode de isbn

    @Override
    final public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    final public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int compareTo(Libro o) {
        return this.getIsbn().compareToIgnoreCase(o.getIsbn());
    }
    
}

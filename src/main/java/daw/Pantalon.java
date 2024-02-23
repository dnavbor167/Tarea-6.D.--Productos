/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
final public class Pantalon extends Ropa {
    //insertamso atributos encapsulados
    private double talla;
    
    //insertamos constructores
    public Pantalon(double talla, String marca, int codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }
    public Pantalon() {
    }
    
    //insertamos getter y setter
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
    
    //insertamos toString

    @Override
    public String toString() {
        return super.toString() + " Pantalon{" + "talla=" + talla + '}';
    }
    
    
    //insertamos equal y hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.talla) ^ (Double.doubleToLongBits(this.talla) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pantalon other = (Pantalon) obj;
        return Double.doubleToLongBits(this.talla) == Double.doubleToLongBits(other.talla);
    }
    
}

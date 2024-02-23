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
public abstract class Ropa extends Producto implements SeEnvia{
    //insertamos atributos encapsulados
    private String marca;
    
    //insertamos constructores
    public Ropa(String marca, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }
    public Ropa() {
    }
    
    //insertamos los getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //insertamos toString

    @Override
    public String toString() {
        return super.toString() + " Ropa{" + "marca=" + marca + '}';
    }
    
    
    //insertamos equal y hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.marca);
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
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando articulo de ropa " + 
                super.toString() + ", Marca: " + this.marca + ", en la "
                        + "dirección " + direccion);
    }
    
}

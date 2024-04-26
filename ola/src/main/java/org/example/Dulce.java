package org.example;

/**
 * Clase abstracta que representa un Dulce.
 * Extiende de la clase Producto.
 */

public abstract class Dulce extends Producto{
    private String sabor;

    public Dulce(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String consumir() {
        return null;
    }
}
package org.example;

/**
 * Clase abstracta que representa un producto.
 * Esta clase sirve como clase madre para las clases Dulce y Bebida.
 */
public abstract class Producto {
    // Variables
    private int codigo;
    private String nombre;
    private int precio;

    // Constructor
    public Producto(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    /**Setters y Getters**/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract  String consumir();
}

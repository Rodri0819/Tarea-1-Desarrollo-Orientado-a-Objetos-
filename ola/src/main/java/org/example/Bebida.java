package org.example;

/**
 * Clase abstracta que representa una bebida.
 * Extiende de la clase Producto.
 */
public abstract class Bebida extends Producto {
    // Variables
    private String marca;

    //Constructor
    public Bebida(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, precio);
        this.marca = marca;
    }

    /**Setter y Getter**/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   //Metodo abstracto para consumir bebida
    @Override
    public abstract String consumir();
}


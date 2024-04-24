package org.example;

public class Fanta extends Bebida {
    // Constructor
    public Fanta(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, precio, marca);
    }

    // Método sobreescrito
    @Override
    public String consumir() {
        return "Bebiendo CocaCola";
    }
}

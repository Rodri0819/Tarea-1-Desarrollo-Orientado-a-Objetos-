package org.example;

public class Sprite extends Bebida {
    // Constructor
    public Sprite(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, precio, marca);
    }

    // Método sobreescrito
    @Override
    public String consumir() {
        return "Bebiendo CocaCola";
    }
}

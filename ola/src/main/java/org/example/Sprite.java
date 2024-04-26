package org.example;

public class Sprite extends Bebida {
    // Constructor
    public Sprite(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.SPRITE.getPrecio(), marca);
    }

    // Método sobreescrito
    @Override
    public String consumir() {
        return "Sprite";
    }
}

package org.example;

enum Precios {
    COCA_COLA(1000),
    SPRITE(900),
    FANTA(800),
    SUPER8(300),
    SNICKERS(400);

    private final int precio;

    Precios(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}

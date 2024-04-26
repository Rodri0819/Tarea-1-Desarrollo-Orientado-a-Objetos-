package org.example;

public class Fanta extends Bebida {
    // Constructor
    public Fanta(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.FANTA.getPrecio(), marca);
    }

    // Método sobreescrito
    @Override
    public String consumir() {
        return "Fanta";
    }
}

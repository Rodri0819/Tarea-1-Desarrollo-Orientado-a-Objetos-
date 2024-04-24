package org.example;

public class CocaCola extends Bebida {
    // Constructor
    public CocaCola(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, precio, marca);
    }

    // Método sobreescrito
    @Override
    public String consumir() {
        return "Bebiendo CocaCola";
    }
}

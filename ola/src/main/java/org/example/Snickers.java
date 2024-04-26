package org.example;

public class Snickers extends Dulce {
    public Snickers(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, Precios.SNICKERS.getPrecio(), sabor);
    }

    @Override
    public String consumir() {
        return "Comiendo Snickers";
    }
}
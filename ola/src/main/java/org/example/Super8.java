package org.example;

public class Super8 extends Dulce {
    public Super8(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, Precios.SUPER8.getPrecio(), sabor);
    }

    @Override
    public String consumir() {
        return "Comiendo Super8";
    }
}

package org.example;

public abstract class Moneda {
    public Moneda() {}

    public abstract int getValor();

    public Moneda getSerie() {
        return this;
    }
}

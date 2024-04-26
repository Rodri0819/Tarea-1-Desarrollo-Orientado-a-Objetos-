package org.example;

abstract class Moneda implements Comparable<Moneda> {
    public abstract int getValor();

    @Override
    public int compareTo(Moneda otra) {
        return Integer.compare(this.getValor(), otra.getValor());
    }
}


package org.example;

/**
 * Representa una moneda de 500 unidades monetarias
 * Esta clase es una subclase concreta de  Moneda, especificando el valor de la moneda como 500
 */
public class Moneda500 extends Moneda {

    /**
     * Devuelve el valor nominal de esta moneda
     * @return El valor de la moneda, que es 500.
     */
    @Override
    public int getValor() {
        return 500;
    }
}

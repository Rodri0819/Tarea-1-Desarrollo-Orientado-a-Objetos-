package org.example;

/**
 * Representa una moneda de 1000 unidades monetarias
 * Esta clase es una subclase concreta de  Moneda, especificando el valor de la moneda como 1000
 */
public class Moneda1000 extends Moneda {

    /**
     * Devuelve el valor nominal de esta moneda
     * @return El valor de la moneda, que es 1000
     */
    @Override
    public int getValor() {
        return 1000;
    }
}

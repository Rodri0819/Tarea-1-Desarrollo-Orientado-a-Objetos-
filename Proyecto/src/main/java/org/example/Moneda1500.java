package org.example;

/**
 * Representa una moneda de 1500 unidades monetarias
 * Esta clase es una subclase concreta de Moneda, especificando el valor de la moneda como 1500
 */
public class Moneda1500 extends Moneda {

    /**
     * Devuelve el valor nominal de esta moneda
     * @return El valor de la moneda, que es 1500
     */
    @Override
    public int getValor() {
        return 1500;
    }
}

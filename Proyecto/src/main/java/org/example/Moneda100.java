package org.example;

/**
 * Representa una moneda de 100 unidades monetarias
 * Esta clase es una subclase concreta de Moneda, especificando el valor de la moneda como 100
 */
public class Moneda100 extends Moneda {

    /**
     * Devuelve el valor nominal de esta moneda
     * @return El valor de la moneda, que es 100
     */
    @Override
    public int getValor() {
        return 100;
    }
}

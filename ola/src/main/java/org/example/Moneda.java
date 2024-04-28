package org.example;

/**
 * Clase abstracta que representa una moneda
 * Implementa la interfaz Comparable para permitir la comparación entre monedas según su valor
 */

public abstract class Moneda implements Comparable<Moneda> {
    /**
     * Método getValor debe ser implementado por las subclases para retornar el valor de la moneda
     */
    public abstract int getValor();

    /**
     * Método compareTo implementa la lógica de comparación de la interfaz Comparable
     * Compara esta moneda con otra moneda basándose en sus valores
     * Retorna un valor negativo si esta moneda es menor que la otra
       cero si son iguales, y un valor positivo si esta moneda es mayor
     */

@Override
    public int compareTo(Moneda otra) {
        return Integer.compare(this.getValor(), otra.getValor());
    }

}

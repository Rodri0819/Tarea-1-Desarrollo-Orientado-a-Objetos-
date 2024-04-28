package org.example;

/**
 * Subclase que representa una Fanta, una bebida específica
 * Extiende de la clase Bebida y personaliza el proceso de consumo
 */
public class Fanta extends Bebida {
    /**
     * Constructor para crear una instancia de Fanta
     * Utiliza un precio predeterminado obtenido de {@code Precios.FANTA}
     * @param codigo El código identificador de la Fanta
     * @param nombre El nombre de la Fanta
     * @param precio No se utiliza, ya que el precio se establece con el valor predeterminado para Fanta
     * @param marca La marca de la Fanta
     */
    public Fanta(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.FANTA.getPrecio(), marca); // Llama al constructor de la clase base Bebida con el precio predeterminado.
    }

    /**
     * Implementa el método consumir de la clase Bebida.
     * Retorna una representación textual de consumir una Fanta.
     * @return Una cadena que representa el acto de consumir una Fanta.
     */
    @Override
    public String consumir() {
        return "Bebiendo Fanta";
    }
}

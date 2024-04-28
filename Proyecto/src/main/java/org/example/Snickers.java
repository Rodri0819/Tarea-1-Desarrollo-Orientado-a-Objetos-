package org.example;

/**
 * Subclase que representa un Snickers, una variedad específica de dulce
 * Extiende de la clase Dulce, especializándola para el producto Snickers
 */
public class Snickers extends Dulce {
    /**
     * Constructor para crear una instancia de Snickers
     * Utiliza un precio predeterminado obtenido de la Enumeración "Precios"
     * @param codigo El código identificador del Snickers
     * @param nombre El nombre del Snickers
     * @param precio No se utiliza, ya que el precio se establece con el valor predeterminado para Snickers
     * @param sabor El sabor del Snickers
     */
    public Snickers(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, Precios.SNICKERS.getPrecio(), sabor); // Llama al constructor de la clase base Dulce con el precio predeterminado.
    }

    /**
     * Implementa el método  consumir de la clase Dulce
     * Retorna una representación textual del acto de consumir un Snickers
     * @return Una cadena que representa el acto de consumir un Snickers
     */
    @Override
    public String consumir() {
        return "Comiendo Snickers";
    }
}
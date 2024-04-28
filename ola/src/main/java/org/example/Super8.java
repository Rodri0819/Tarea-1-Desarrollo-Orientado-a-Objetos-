package org.example;

/**
 * Subclase que representa un Super8, un tipo específico de dulce
 * Extiende de la clase Dilce y personaliza el proceso de consumo
 */
public class Super8 extends Dulce {
    /**
     * Constructor para crear una instancia de Super8
     * Utiliza un precio predeterminado obtenido de {@code Precios.SUPER8}
     *
     * @param codigo El código identificador del Super8
     * @param nombre El nombre del Super8
     * @param precio No se utiliza, ya que el precio se establece con el valor predeterminado para Super8
     * @param sabor El sabor del Super8
     */
    public Super8(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, Precios.SUPER8.getPrecio(), sabor); // Llama al constructor de la clase base Dulce con el precio predeterminado.
    }

    /**
     * Implementa el método {@code consumir} de la clase Dulce
     * Retorna una representación textual del acto de consumir un Super8
     *
     * @return Una cadena que representa el acto de consumir un Super8
     */
    @Override
    public String consumir() {
        return "Comiendo Super8";
    }
}
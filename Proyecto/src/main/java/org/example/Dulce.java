package org.example;

/**
 * Clase abstracta que representa un dulce, extendiendo de la clase {@code Producto}
 * Esta clase proporciona caracteristicas del dulce
 */
public abstract class Dulce extends Producto {
    private String sabor;

    /**
     * Constructor que inicializa un nuevo dulce con detalles específicos
     * @param codigo El código identificador del dulce
     * @param nombre El nombre del dulce
     * @param precio El precio del dulce
     * @param sabor El sabor del dulce
     */
    public Dulce(int codigo, String nombre, int precio, String sabor) {
        super(codigo, nombre, precio); // Llama al constructor de la clase base, Producto.
        this.sabor = sabor;            // Inicializa el sabor del dulce con el valor proporcionado.
    }

    /**
     * Getter que devuelve el sabor del dulce
     * @return El sabor del dulce
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * Setter que establece o actualiza el sabor del dulce
     * @param sabor El nuevo sabor del dulce
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * Implementa el método consumir de la clase Producto
     * @return Una cadena que describe el acto de consumir el dulce, mencionando su nombre
     */
    @Override
    public String consumir() {
        return "Comiendo " + getNombre();
    }
}
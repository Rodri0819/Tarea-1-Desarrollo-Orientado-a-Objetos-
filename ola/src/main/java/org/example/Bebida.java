package org.example;

/**
 * Clase abstracta que representa una bebida, extendida de la clase {@code Producto}
 * Esta clase proporciona la estructura de una bebida
 * Requiere que las subclases implementen el método consumir
 */
public abstract class Bebida extends Producto {
    /**
     * Marca de la bebida.
     */
    private String marca;

    /**
     * Constructor para crear una nueva bebida con detalles específicos
     * @param codigo : El código identificador de la bebida
     * @param nombre : El nombre de la bebida
     * @param precio : El precio de la bebida
     * @param marca : La marca de la bebida
     */
    public Bebida(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, precio); // Llama al constructor de la clase base, Producto
        this.marca = marca;            // Inicializa la marca de la bebida con el valor proporcionado
    }

    /**
     * Getter: Devuelve la marca de la bebida
     * @return La marca de la bebida
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter: Establece o actualiza la marca de la bebida
     * @param marca La nueva marca de la bebida
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para definir el consumo de las bebidas
     */
    @Override
    public abstract String consumir();
}
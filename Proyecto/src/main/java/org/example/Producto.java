package org.example;

/**
 * Clase abstracta que representa un producto
 * Sirve como clase base para otras clases como {@link Dulce} y {@link Bebida}, proporcionando una estructura común
 * Esta clase define propiedades básicas como código, nombre y precio, y exige la implementación del método consumir
 */
public abstract class Producto {
    private int codigo;   // Código identificador del producto.
    private String nombre; // Nombre del producto.
    private int precio;   // Precio del producto en

    /**
     * Constructor para inicializar un nuevo producto con un código, nombre y precio
     * @param codigo El código identificador del producto
     * @param nombre El nombre del producto
     * @param precio El precio del producto en centavos
     */
    public Producto(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    /** Métodos getter y setter para las propiedades del producto **/

    /**
     * Devuelve el código del producto.
     * @return El código identificador del producto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece un nuevo código para el producto.
     * @param codigo El nuevo código identificador
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el precio del producto
     * @return El precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el producto
     * @param precio El nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el nombre del producto
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el producto
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para definir cómo se consume el producto
     * @return Una cadena que describe la acción de consumir el producto
     */
    public abstract String consumir();
}
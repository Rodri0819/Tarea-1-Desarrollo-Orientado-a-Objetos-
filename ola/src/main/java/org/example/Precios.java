package org.example;

/**
 * Enumeración que define los precios estándar de los productos
 * Cada elemento de la enumeración representa un producto diferente con su precio
 * Esta enumeración facilita la gestión y el acceso a los precios de los productos
 */
public enum Precios {
    COCA_COLA(1000),  // Precio de Coca Cola
    SPRITE(900),      // Precio de Sprite
    FANTA(800),       // Precio de Fanta
    SUPER8(300),      // Precio de Super8
    SNICKERS(400);    // Precio de Snickers

    private final int precio;  // Variable que almacena el precio del producto.

    /**
     * Constructor para la enumeración que asigna un precio específico a cada producto
     * @param precio El precio del producto
     */
    Precios(int precio) {
        this.precio = precio;  // Inicializa la variable de precio con el valor proporcionado.
    }

    /**
     * Devuelve el precio del producto
     * @return El precio del producto
     */
    public int getPrecio() {
        return precio;  // Retorna el precio almacenado.
    }
}
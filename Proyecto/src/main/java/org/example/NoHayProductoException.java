package org.example;

/**
 * Excepción personalizada que se lanza cuando no hay productos disponibles
 * Esta clase extiende de Exception, permite manejar situacion de excepción
 * cuándo no hay productos en el deposito
 */
public class NoHayProductoException extends Exception {
    /**
     * Constructor que crea una nueva excepción
     * @param mensaje El mensaje que explica la causa de la excepción
     */
    public NoHayProductoException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base, Exception, pasando el mensaje.
    }
}
package org.example;

/**
 * Excepción personalizada que se lanza cuando no hay productos disponibles
 * Esta clase extiende de Exception, permite manejar situacion de excepción
 * cuándo no hay productos en el deposito
 */

public class PagoInsuficienteException extends Exception {
    /**
     * Constructor que crea una nueva excepción con un mensaje específico
     * @param mensaje El mensaje que explica la causa de la excepción, indicando que el pago fue insuficiente
     */
    public PagoInsuficienteException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base, Exception, pasando el mensaje.
    }
}
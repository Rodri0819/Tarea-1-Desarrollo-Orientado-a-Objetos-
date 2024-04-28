package org.example;

/**
 * Excepción personalizada que se lanza cuando no se paga correctamente
 * Esta clase extiende de Exception, permite manejar situacion de excepción
 * cuando el pago es nulo
 */
public class PagoIncorrectoException extends Exception {
    /**
     * Constructor que crea una nueva excepción con un mensaje específico
     * @param mensaje El mensaje que explica la causa de la excepción
     */
    public PagoIncorrectoException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base, Exception, pasando el mensaje.
    }
}
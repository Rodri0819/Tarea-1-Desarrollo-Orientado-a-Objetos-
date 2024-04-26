package org.example;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
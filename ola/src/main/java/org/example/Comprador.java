package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida bebida = exp.comprarBebida(m, cualBebida);
        if (bebida != null) {
            sonido = bebida.beber();
        } else {
            sonido = null;
        }

        vuelto = 0;
        Moneda monedaVuelto;
        while ((monedaVuelto = exp.getVuelto()) != null) {
            vuelto += monedaVuelto.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}

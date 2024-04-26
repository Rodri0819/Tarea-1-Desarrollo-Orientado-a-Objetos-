package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualProducto, Expendedor exp) {  // Cambiar cualBebida a cualProducto
        Producto producto = exp.comprarProducto(m, cualProducto);  // Llamar a comprarProducto en lugar de comprarBebida
        if (producto != null) {
            sonido = producto.consumir();  // Llamar al método consumir() de Producto
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

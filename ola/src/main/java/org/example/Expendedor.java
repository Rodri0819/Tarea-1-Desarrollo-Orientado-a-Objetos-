package org.example;
/**
 * HAY QUE CAMBIAR EL METODO ARRYLIST AND LIST POR EL METODO PROPUESTO EN LA PAUTA
**/
import java.util.ArrayList;
import java.util.List;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    private Deposito<Moneda> monedaVueltas;
    private List<Deposito<Producto>> productos;
    private int precioBebidas;

    public Expendedor(int numProductos, int precioBebidas) {
        this.precioBebidas = precioBebidas;
        productos = new ArrayList<>();
        monedaVueltas = new Deposito<>();

        for (int i = 0; i < 2; i++) {
            productos.add(new Deposito<Producto>());
        }

        for (int i = 0; i < numProductos; i++) {
            productos.get(COCA - 1).add(new CocaCola(i, "CocaCola", 1000, "CocaCola"));
            productos.get(SPRITE - 1).add(new Sprite(i, "Sprite", 800, "Sprite"));
        }
    }

    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null || cual < COCA || cual > SPRITE) {
            if (m != null) {
                monedaVueltas.add(m);
            }
            return null;
        }

        Deposito<Producto> depositoProducto = productos.get(cual - 1);
        if (depositoProducto.isEmpty()) {
            monedaVueltas.add(m);
            return null;
        }

        int valorMoneda = m.getValor();
        if (valorMoneda < precioBebidas) {
            monedaVueltas.add(m);
            return null;
        }

        int cambio = valorMoneda - precioBebidas;
        while (cambio >= 100) {
            monedaVueltas.add(new Moneda100());
            cambio -= 100;
        }

        return depositoProducto.get();
    }

    public Moneda getVuelto() {
        return monedaVueltas.get();
    }
}

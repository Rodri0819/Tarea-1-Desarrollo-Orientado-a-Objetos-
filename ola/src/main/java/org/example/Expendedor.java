package org.example;
import java.util.ArrayList;
import java.util.List;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    private Deposito<Moneda> monedaVueltas;
    private List<Deposito<Bebida>> bebidas;
    private int precioBebidas;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precioBebidas = precioBebidas;
        bebidas = new ArrayList<>();
        monedaVueltas = new Deposito<>();

        for (int i = 0; i < 2; i++) {
            bebidas.add(new Deposito<Bebida>());
        }

        for (int i = 0; i < numBebidas; i++) {
            bebidas.get(COCA - 1).add(new CocaCola(i));
            bebidas.get(SPRITE - 1).add(new Sprite(i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null || cual < COCA || cual > SPRITE) {
            if (m != null) {
                monedaVueltas.add(m);
            }
            return null;
        }

        Deposito<Bebida> depositoBebida = bebidas.get(cual - 1);
        if (depositoBebida.isEmpty()) {
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

        return depositoBebida.get();
    }

    public Moneda getVuelto() {
        return monedaVueltas.get();
    }
}
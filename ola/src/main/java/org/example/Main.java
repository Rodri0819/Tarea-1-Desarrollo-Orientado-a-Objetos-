package org.example;
import java.util.ArrayList;
import java.util.List;

abstract class Bebida {
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();
}

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "cocacola";
    }
}

class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "sprite";
    }
}

abstract class Moneda {
    public Moneda() {}

    public abstract int getValor();

    public Moneda getSerie() {
        return this;
    }
}

class Moneda1500 extends Moneda {
    public Moneda1500() {
        super();
    }

    @Override
    public int getValor() {
        return 1500;
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    @Override
    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    @Override
    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    @Override
    public int getValor() {
        return 100;
    }
}

class Deposito<T> {
    private List<T> items = new ArrayList<>();

    public T get() {
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null;
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

class Expendedor {
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

class Comprador {
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
class main {
    public static void main(String[] args) {

    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Constructor de la clase Expendedor. Inicializa los depósitos de productos y configura cada tipo
 * de producto con una cantidad inicial según el número especificado de productos
 * Prepara el depósito de monedas para el vuelto
 */

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    public static final int SUPER8 = 4;
    public static final int SNICKERS = 5;

    private Deposito<Moneda> monedaVueltas; //Instancia de deposito para el vuelto de las monedas
    private List<Deposito<Producto>> productos; //Instancia de deposito para los productos
    /**
     * Constructor del Expendedor que inicializa un expendedor
     * Inicializa todos los productos, agregando las bebidas y duces una cantidad de @param numProductos al deposito
     * @param numProductos
     */
    public Expendedor(int numProductos) {
        productos = new ArrayList<>(); //Inicializa una lista deproductos
         monedaVueltas = new Deposito<>(); //Inicializa una instancia de deposito para el vuelto de las monedas

        for (int i = 0; i < 5; i++) { //Inicializa la lista de productos (5 productos)
            productos.add(new Deposito<Producto>());
        }

        //Agrega las instancias de los productos al deposito
        for (int i = 0; i < numProductos; i++) {
            productos.get(COCA - 1).add(new CocaCola(i, "CocaCola", Precios.COCA_COLA.getPrecio(), "CocaCola"));
            productos.get(SPRITE - 1).add(new Sprite(i, "Sprite", Precios.SPRITE.getPrecio(), "Sprite"));
            productos.get(FANTA - 1).add(new Fanta(i, "Fanta", Precios.FANTA.getPrecio(), "Fanta"));
            productos.get(SUPER8 - 1).add(new Super8(i,"Super8",Precios.SUPER8.getPrecio(),"Chocolate"));
            productos.get(SNICKERS - 1).add(new Snickers(i,"Snickers",Precios.SNICKERS.getPrecio(),"Snicker"));
        }
    }

    /**
     * Intenta comprar un producto usando la moneda proporcionada
     * También maneja la lógica para calcular el cambio necesario y actualizar el depósito de vuelto
     * @param m la moneda usada para comprar el producto
     * @param cual el identificador del producto que se desea comprar
     * @return el Producto comprado
     * @throws PagoIncorrectoException si la moneda es nula
     * @throws NoHayProductoException si el producto solicitado no está disponible
     * @throws PagoInsuficienteException si la moneda proporcionada no cubre el costo del producto
     */

    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("La moneda no puede ser nula");
        }

        if (cual < COCA || cual > SNICKERS) {
            throw new NoHayProductoException("Número de producto incorrecto o producto no disponible");
        }

        // Obtener el precio de los prodcutos seleccionados, utilizando la funcions Precios.values(), que devuelve un array de todos los valores
        //del enum "Precios", accediendo a la posición cual-1 que es el indice del producto comprado dado que el indice comienza en 0,
        //de esta manera llamando .getPrecios, este metodo devuelve el precio del producto
        int precioProductos = Precios.values()[cual - 1].getPrecio();

        //Ingresa al deposito de productos en la posición del producto comprado
        Deposito<Producto> depositoProducto = productos.get(cual - 1);

        if (depositoProducto.isEmpty()) { //Si en esa posición no hay un producto, tira NoHayProductoException
            throw new NoHayProductoException("No hay producto disponible en el depósito");
        }

        //Declara la variable valor moneda, dandole el valor de la moneda recibida por el comprador
        int valorMoneda = m.getValor();
        if (valorMoneda < precioProductos) { //Si el valor de la moneda recibida es menor al precio del producto, tira PagoInsuficienteException
            throw new PagoInsuficienteException("El valor de la moneda no es suficiente para comprar el producto");
        }
        //Declara cambio como el valor de la moneda - el precio de los productos
        int cambio = valorMoneda - precioProductos;
        //While para agregar la cantidad de monedas al deposito de vuelto
        while (cambio >= 100) { //Mientras el cambio sea mayor o igual a 100
            monedaVueltas.add(new Moneda100()); //Se agregan monedas de 100 al deposito de vuelto
            cambio = cambio - 100; //Descuenta esa moneda de 100 al bucle
        }
        return depositoProducto.get();
    }

    /**
     * Obtiene el próximo vuelto disponible del depósito de monedas de vuelto. Si no hay vuelto disponible,
     * devuelve null
     * @return la próxima Moneda de vuelto disponible, o null si no hay vuelto
     */

    public Moneda getVuelto() {
        return monedaVueltas.get();
    }
}

package org.example;

/**
 * Subclase que representa una Sprite, una bebida específica
 * Extiende de la clase Bebida y personaliza el proceso de consumo
 */
public class Sprite extends Bebida {
    /**
     * Constructor para crear una instancia de Sprite
     * Utiliza un precio predeterminado obtenido de la enumeración "Precios"
     * @param codigo El código identificador de la Sprite
     * @param nombre El nombre de la Sprite
     * @param precio No se utiliza, ya que el precio se establece con el valor predeterminado para Sprite
     * @param marca La marca de la Sprite
     */
    public Sprite(int codigo, String nombre, int precio, String marca) {
        super(codigo, nombre, Precios.SPRITE.getPrecio(), marca); // Llama al constructor de la clase base Bebida con el precio predeterminado.
    }

    /**
     * Implementa el método consumir de la clase Bebida
     * Retorna una representación textual de consumir una Sprite
     * @return Una cadena que representa el acto de consumir una Sprite
     */
    @Override
    public String consumir() {
        return "Bebiendo Sprite";
    }
}
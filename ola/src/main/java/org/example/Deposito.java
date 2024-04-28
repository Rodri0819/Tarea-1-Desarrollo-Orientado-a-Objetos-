package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase genérica que permite almacenar y gestionar productos en una lista
 * Esta clase puede manejar tipos de objeto definido como {@code T} y proporciona
 * métodos para agregar, obtener y verificar si la lista está vacía
 *
 * @param <T> El tipo de elementos que almacena este depósito
 */
public class Deposito<T> {
    private List<T> items = new ArrayList<>(); // Lista para almacenar los elementos del tipo T.

    /**
     * Agrega un elemento al depósito.
     * @param item El elemento de tipo T que se añadirá al depósito
     */
    public void add(T item) {
        items.add(item); // Añade el elemento al final de la lista.
    }

    /**
     * Obtiene y elimina el primer elemento del depósito
     * @return El primer elemento del depósito si existe, de lo contrario {@code null}
     */
    public T get() {
        if (!items.isEmpty()) { //Verifica que la lista no está vacia
            return items.remove(0); // Retorna y elimina el primer elemento de la lista.
        }
        return null; // Retorna null si la lista está vacía.
    }

    /**
     * Verifica si el depósito está vacío
     * @return {@code true} si el depósito no tiene elementos, de lo contrario {@code false}
     */
    public boolean isEmpty() {
        return items.isEmpty(); // Retorna true si la lista no contiene elementos.
    }
}
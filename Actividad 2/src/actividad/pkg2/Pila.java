/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

import java.util.LinkedList;

/**
 *
 * @author Alexa
 */
public class Pila<T> {
    private LinkedList<T> lista = new LinkedList<>();

    public void push(T elemento) {
        lista.addFirst(elemento);
    }

    public T pop() {
        return lista.removeFirst();
    }

    public T peek() {
        return lista.getFirst();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }
}
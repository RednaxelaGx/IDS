/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

public class Pila<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public void push(E element) {
        list.insert(element, 0); // Inserta al principio de la lista
    }

    public E pop() {
        E element = list.getHead(); // Obtiene el elemento en la cabeza de la lista
        if (element == null) {
            return null; // Manejo de error si la pila está vacía
        }
        list.delete(0); // Elimina el primer elemento
        return element;
    }

    public E peek() {
        return list.getHead(); // Retorna el primer elemento sin eliminarlo
    }

    public void print() {
        list.print();
    }
}

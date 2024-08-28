/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

public class Cola<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public void enqueue(E element) {
        list.insert(element, list.size());
    }

    public E dequeue() {
        if (list.getHead() == null) {
            return null; // Manejo de error si la cola está vacía
        }
        E element = list.getHead();
        list.delete(0);
        return element;
    }

    public E peek() {
        return list.getHead(); // Retorna el primer elemento sin eliminarlo
    }

    public void print() {
        list.print();
    }
}


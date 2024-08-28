/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

public class SinglyLinkedList<E> {
    private class Node {
        E data;
        Node next;
        Node(E data) { this.data = data; }
    }
    private Node head;
    private int size = 0; // Añadido contador de tamaño

    public void insert(E element, int place) {
        Node newNode = new Node(element);
        if (place == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < place - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
        size++; // Actualiza el tamaño
    }

    public void delete(int place) {
        if (place == 0 && head != null) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < place - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
        size--; // Actualiza el tamaño
    }

    public E find(E element) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        return size; // Devuelve el tamaño almacenado
    }

    public E getHead() {
        return head != null ? head.data : null;
    }
}

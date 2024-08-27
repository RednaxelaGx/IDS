/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg2;

import java.util.LinkedList;

/**
 *
 * @author Alexa
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba de la Pila
        Pila<String> pilaComandos = new Pila<>();
        pilaComandos.push("comando1");
        pilaComandos.push("comando2");
        System.out.println("Último comando: " + pilaComandos.peek());
        pilaComandos.pop();
        System.out.println("Último comando después de deshacer: " + pilaComandos.peek());

        // Prueba de la Cola
        Cola<String> colaProgramas = new Cola<>();
        colaProgramas.enqueue("programa1");
        colaProgramas.enqueue("programa2");
        System.out.println("Primer programa en ejecución: " + colaProgramas.peek());
        colaProgramas.dequeue();
        System.out.println("Primer programa después de ejecutar: " + colaProgramas.peek());
    }
}

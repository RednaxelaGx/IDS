/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg2;

import java.time.LocalDate;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila<Task> pila = new Pila<>();
        Cola<Task> cola = new Cola<>();

        while (true) {
            System.out.println("Seleccione la operación:");
            System.out.println("1. Crear tarea y agregar a la cola de ejecución");
            System.out.println("2. Enviar tarea de la cola a la pila de comandos");
            System.out.println("3. Deshacer último comando (pop de la pila)");
            System.out.println("4. Ver historial de comandos (pila)");
            System.out.println("5. Ver cola de ejecución");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Ingrese el nombre de la tarea:");
                    String name = scanner.next();
                    System.out.println("Ingrese la fecha de ejecución (YYYY-MM-DD):");
                    LocalDate date = LocalDate.parse(scanner.next());
                    Task task = new Task(name, date);
                    cola.enqueue(task);
                    break;
                case 2:
                    Task taskFromQueue = cola.dequeue();
                    if (taskFromQueue != null) {
                        pila.push(taskFromQueue);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 3:
                    Task undoneTask = pila.pop();
                    if (undoneTask != null) {
                        System.out.println("Comando deshecho: " + undoneTask);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 4:
                    pila.print();
                    break;
                case 5:
                    cola.print();
                    break;
                default:
                    System.out.println("Operación no válida");
            }
        }
    }
}

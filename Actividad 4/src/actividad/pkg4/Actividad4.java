/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg4;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author Alexa
 */
import java.util.Scanner;

public class Actividad4 {
    private ArbolBinario arbol;
    private Scanner scanner;

    public Actividad4() {
        this.arbol = new ArbolBinario();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Menu Interactivo");
        System.out.println("1. Insertar empleado");
        System.out.println("2. Mostrar preorden");
        System.out.println("3. Mostrar inorden");
        System.out.println("4. Mostrar postorden");
        System.out.println("5. Eliminar empleado");
        System.out.println("6. Salir");
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    insertarEmpleado();
                    break;
                case 2:
                    mostrarPreorden();
                    break;
                case 3:
                    mostrarInorden();
                    break;
                case 4:
                    mostrarPostorden();
                    break;
                case 5:
                    eliminarEmpleado();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 6);
    }

    private void insertarEmpleado() {
        System.out.print("Ingrese el ID del empleado: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        Empleado empleado = new Empleado(id, nombre);
        arbol.insertar(empleado);
        System.out.println("Empleado insertado correctamente");
    }

    private void mostrarPreorden() {
        System.out.println("Preorden:");
        arbol.preorden();
        System.out.println();
    }

    private void mostrarInorden() {
        System.out.println("Inorden:");
        arbol.inorden();
        System.out.println();
    }

    private void mostrarPostorden() {
        System.out.println("Postorden:");
        arbol.postorden();
        System.out.println();
    }

    private void eliminarEmpleado() {
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        int id = scanner.nextInt();
        arbol.eliminar(id);
        System.out.println("Empleado eliminado correctamente");
    }

    public static void main(String[] args) {
        Actividad4 actividad = new Actividad4();
        actividad.ejecutarMenu();
    }
}
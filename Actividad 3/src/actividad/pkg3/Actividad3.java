/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg3;

/**
 *
 * @author Alexa
 */
public class Actividad3 {

    public static void main(String[] args) {
        System.out.println("¿1234321 es palíndromo?: " + Los_5.esPalindromo(1234321));
        System.out.println("¿12345678 es palíndromo?: " + Los_5.esPalindromo(12345678));

        int[] conjunto = {3, 34, 4, 12, 5, 2};
        int sumaObjetivo = 9;
        System.out.println("¿Existe un subconjunto que suma " + sumaObjetivo + "?: " + Los_5.existeSubsetSum(conjunto, sumaObjetivo));

        int[][] tablero = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println("Resolviendo Sudoku...");
        if (Los_5.resolverSudoku(tablero)) {
            Los_5.imprimirTablero(tablero);
        } else {
            System.out.println("El Sudoku no tiene solución.");
        }

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        Los_5.voltear(stack);
        System.out.println("Stack volteado: " + stack);

        int numero = 8;
        System.out.println("El número " + numero + " en binario es: " + Los_5.decimalABinario(numero));

        System.out.println("\nFibonacci:");
        int n = 10;
        System.out.println("Fibonacci iterativo para n = " + n + ": " + Fibonacci.fibonacciIterativo(n));
        System.out.println("Fibonacci recursivo para n = " + n + ": " + Fibonacci.fibonacciRecursivo(n));

        System.out.println("\nReflexion:\nEn este ejercicio, utilicé la recursividad y deshacer para resolver varios problemas.\nEncuentro que la recursividad simplifica el código al dividir problemas complejos en partes más pequeñas, como reorganizar números, encontrar subconjuntos y convertir números decimales a binarios.\nRetroceder me permite resolver Sudokus explorando todas las soluciones posibles y retrocediendo si es necesario.\nEstas técnicas me han ayudado a encontrar soluciones elegantes y efectivas a problemas complejos.");
    }
}


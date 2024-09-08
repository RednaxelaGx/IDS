/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg3;

import java.util.Stack;

/**
 *
 * @author Alexa
 */
public class Los_5 {

    public static boolean esPalindromo(int numero) {
        int numReverso = invertirNumero(numero, 0);
        return numero == numReverso;
    }

    private static int invertirNumero(int numero, int reverso) {
        if (numero == 0) {
            return reverso;
        }
        return invertirNumero(numero / 10, reverso * 10 + numero % 10);
    }

    public static boolean existeSubsetSum(int[] nums, int objetivo) {
        return verificar(nums, nums.length - 1, objetivo);
    }

    private static boolean verificar(int[] nums, int index, int objetivo) {
        if (objetivo == 0) return true;
        if (index < 0) return false;
        if (nums[index] > objetivo) return verificar(nums, index - 1, objetivo);
        return verificar(nums, index - 1, objetivo) || verificar(nums, index - 1, objetivo - nums[index]);
    }

    public static boolean resolverSudoku(int[][] tablero) {
        return resolver(tablero);
    }

    private static boolean resolver(int[][] tablero) {
        int[] vacio = encontrarVacio(tablero);
        if (vacio == null) return true;

        int fila = vacio[0], col = vacio[1];
        for (int num = 1; num <= 9; num++) {
            if (esValido(tablero, fila, col, num)) {
                tablero[fila][col] = num;
                if (resolver(tablero)) return true;
                tablero[fila][col] = 0;
            }
        }
        return false;
    }

    private static int[] encontrarVacio(int[][] tablero) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == 0) return new int[]{i, j};
            }
        }
        return null;
    }

    private static boolean esValido(int[][] tablero, int fila, int col, int num) {
        for (int x = 0; x < 9; x++) {
            if (tablero[fila][x] == num || tablero[x][col] == num || tablero[3 * (fila / 3) + x / 3][3 * (col / 3) + x % 3] == num) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void voltear(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            int fondo = pila.pop();
            voltear(pila);
            agregarAlFondo(pila, fondo);
        }
    }

    private static void agregarAlFondo(Stack<Integer> pila, int valor) {
        if (pila.isEmpty()) {
            pila.push(valor);
        } else {
            int temp = pila.pop();
            agregarAlFondo(pila, valor);
            pila.push(temp);
        }
    }

    public static String decimalABinario(int n) {
        if (n == 0) return "0";
        return convertirABinario(n);
    }

    private static String convertirABinario(int n) {
        if (n == 0) {
            return "";
        }
        return convertirABinario(n / 2) + (n % 2);
    }
}
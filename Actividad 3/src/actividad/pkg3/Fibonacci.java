/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg3;

/**
 *
 * @author Alexa
 */
public class Fibonacci {

    public static int fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 0;
        
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }
        
        return fib;
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci iterativo para n = " + n + ": " + fibonacciIterativo(n));
        System.out.println("Fibonacci recursivo para n = " + n + ": " + fibonacciRecursivo(n));
    }
}

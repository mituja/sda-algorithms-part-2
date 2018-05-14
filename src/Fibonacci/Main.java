package Fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci " + fibonacci(9));
        System.out.println("Fibonacci rekurencyjnie " + fibonacciRecursion(9));
    }

    private static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= number; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    private static int fibonacciRecursion(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }
}

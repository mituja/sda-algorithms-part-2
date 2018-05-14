package Factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        Integer number = sc.nextInt();
        calculateFactorial(number);
        System.out.println("Rekurencyjnie: " + factorialRecursion(5));
    }

    private static void calculateFactorial(int number) {
        Integer factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Silnia wynosi: " + factorial);
    }

    private static int factorialRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }
}

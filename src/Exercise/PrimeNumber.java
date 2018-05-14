package Exercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do sprawdzenia: ");
        int testNumber = sc.nextInt();

        for (int i = 0; i < testNumber; i++) {
            System.out.println("Wprowadź liczbę: ");
            int number = sc.nextInt();
            System.out.println(isPrime(number));
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= (Math.sqrt(number) + 1); i++) {
            if (number % i == 0 || number == 1) {
                return false;
            }
        }
        return true;
    }
}

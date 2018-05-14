package Exercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type test amount: ");
        int testNumber = sc.nextInt();
        for (int i = 0; i < testNumber; i++) {
            System.out.println("Type year: ");
            int year = sc.nextInt();
            System.out.println(isLeapYear(year));
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}

package exam;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        int n = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Podaj liczbe:");
                n = scan.nextInt();
                if (n > a) {
                    System.out.println("Za dużo");

                } else if (n < a) {
                    System.out.println("za mało");
                }

            } catch (InputMismatchException e) {
                System.out.println("To nie jest liczba");
            }
        } while (a != n);
        System.out.println("zgadłeś");
    }
}

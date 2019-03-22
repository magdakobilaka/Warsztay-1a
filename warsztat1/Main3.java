import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;

        int guess = ((max - min) / 2) + min;
        System.out.println(guess);


        int index = 0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj więcej/ mniej");
            String n = scan.next();

            if (n.equals("więcej")) {
                min = guess;
                guess = ((max - min) / 2) + min;
                System.out.println(guess);

            } else if (n.equals("mniej")) {
                max = guess;
                guess = ((max - min) / 2) + min;
                System.out.println(guess);

            } else if (n.equals("zgadłeś")) {
                System.out.println("wygrałem");
            }
            index++;
        } while (index < 10);

    }


}



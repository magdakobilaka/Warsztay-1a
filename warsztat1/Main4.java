import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj rodzaj kostkiw w formacje xDy+z np:2D10+20");
        String kostka = scan.nextLine();

        String[] partsTimes = kostka.split("D");
        int times = 1;
        if (partsTimes[0].length() > 0) {
            times = Integer.parseInt(partsTimes[0]);

        }

        String[] positive = partsTimes[1].split("\\+");
        String[] negative = partsTimes[1].split("-");
        int cube = Integer.parseInt(positive[0]);
        int modification = 0;
        int squere = 0;
        squere = Integer.parseInt(negative[0]);
        if (positive[1].length() > 1 && positive[1].length() > 0) {
            modification = Integer.parseInt(positive[1]);
            squere = Integer.parseInt(negative[0]);
        } else if (negative[1].length() > 1 && negative[1].length() > 0) {
            modification = Integer.parseInt(negative[1] + (-1));
            squere = Integer.parseInt(negative[0]);
        }
        System.out.println("rzucam" + times + "razy kostką" + squere + "ścienną");
        int result = 0;
        Random rand = new Random();
        for (int i = 0; i < times; i++) {
            int probe = rand.nextInt(squere) + 1;
            System.out.println(probe);
            result += probe;
        }
        result = result + modification;

        System.out.println("wynik " + result);

    }

}
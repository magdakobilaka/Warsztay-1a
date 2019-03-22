import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] useNumber = getNumbersFromUSer();
        Integer[] randomNubers = getRandomNubers();
        cheakUserWin(useNumber, randomNubers);


    }

    private static void cheakUserWin(int[] useNumber, Integer[] randomNubers) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (useNumber[i] == randomNubers[j]) {
                    count++;
                }
            }
        }
        if (count > 3) {
            System.out.println("Trafiłeś" + count + "liczb");
        }
    }

    private static Integer[] getRandomNubers() {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static int[] getNumbersFromUSer() {

        Scanner scann = new Scanner(System.in);
        int[] numbers = new int[6];
        int index = 0;
        while (index < 6) {
            System.out.println("podaj liczbe y");
            while (!scann.hasNextInt()) {
                scann.hasNextInt();
            }

            int useNumber = scann.nextInt();
            boolean SameNumber = false;
            for (int i = 0; i < index; i++) {
                if (numbers[i] == useNumber) {
                    SameNumber = true;
                    break;
                }
            }

            if (SameNumber == false && useNumber > 1 && useNumber < 49) {
                numbers[index] = useNumber;
                index++;
            }


        }
        return numbers;
    }
}






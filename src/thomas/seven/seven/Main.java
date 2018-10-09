package thomas.seven.seven;

import java.util.Random;

public class Main {

    static Random rng = new Random();

    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = getNumbers();
        }

        int[] count = new int[10];

        for (int i = 0; i < count.length; i++) {

            count[numbers[i]]++;

        }


        for (int i = 0; i < count.length; i++) {

            System.out.println("number of " + i + "\'s is " + count[i]);

        }

    }

    public static int getNumbers() {


        return rng.nextInt(10);
    }
}

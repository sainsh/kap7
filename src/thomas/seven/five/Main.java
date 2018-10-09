package thomas.seven.five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        int[] numbers = new int[10];


        int count = 10;

        for (int i = 0; i < numbers.length; i++) {  // input into array

            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {      // check for each number if another of that number exists in the array,
                if (numbers[i] == numbers[j] && i != j) {
                    numbers[j] = 0;     // set the latter of 2 equal numbers to zero to preserve input order
                    count--;


                }

            }
        }



            String output = "";

            for (int distinct : numbers) {  // make output, ignore zeros as they are not distict
                if (distinct != 0) {
                    output += distinct + " ";
                }
            }

            System.out.printf("the number of destincts is %d\n", count);
            System.out.printf("the distincts numbers are: %s", output);


    }
}

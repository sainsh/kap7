package thomas.seven.three;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");

        int[] numbers;

        int count = 0;

        int input = 1;
        String inputString = "";

        while (true) {
            input = in.nextInt();       // get integer inputs
            if (input == 0) {
                break;
            }
            count++;
            inputString += input + " ";     //put input in string
        }
        numbers = new int[count];       //make array with length = number of inputs

        String[] inputStringArray = inputString.split(" "); //split string into array at " "

        for (int i = 0; i < inputStringArray.length; i++) {
            numbers[i] = Integer.parseInt(inputStringArray[i]);       // put input in integer array

        }
        int counts[] = new int[101];        // make count array to keep track of how many times each number has occurred
        for (int i = 0; i < numbers.length; i++) {

            counts[numbers[i]]++;
        }

        for (int i = 0; i < counts.length; i++) {       //output the count array but only for numbers which have occurred
            if (counts[i] != 0) {
                System.out.printf("\n%d occurs %d %s", i, counts[i], isMultiple(counts[i]));
            }
        }


    }

    public static String isMultiple(int times) {        // choose between time and times
        if (times == 1) {
            return "time";
        } else return "times";
    }
}

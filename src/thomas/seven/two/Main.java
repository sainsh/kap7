package thomas.seven.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

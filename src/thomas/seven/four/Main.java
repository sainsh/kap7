package thomas.seven.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] scores = new int[100];

        Scanner in = new Scanner(System.in);

        System.out.print("Enter scores, end with a negative number: ");

        int input;
        String inputString="";
        int count =0;

        while (true) {

            input = in.nextInt();       //get user input

            if(input < 0){              //stop at negative value
                break;
            }
            count++;
            inputString += input + " ";     //put input in string
        }

        String[] inputStringArray = inputString.split(" "); //split string into array at " "

        for (int i = 0; i < inputStringArray.length; i++) {
            scores[i] = Integer.parseInt(inputStringArray[i]);       // put input in integer array

        }
        int total=0;

        for(int score: scores){     //sum scores
            total += score;
        }


        double average = total/count;   //set average

        int aboveAverage=0;
        int belowAverage=0;
        for(int i = 0; i < count; i++){     // count above and below average
            if(scores[i] >=average){
                aboveAverage++;
            }else{
                belowAverage++;
            }
        }
        System.out.printf("number of students above average: %d\nnumber of students below average: %d\n average is %.2f", aboveAverage, belowAverage,average);
    }
}

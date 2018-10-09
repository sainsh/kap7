package thomas.seven.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = in.nextInt();    //gets the number of students

        System.out.printf("\nEnter %d scores: ", numberOfStudents);
        int[] scores = new int[numberOfStudents]; // array the size of input

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = in.nextInt();       // load in values for scores
        }
        int best = 0;
        for (int i = 0; i < scores.length; i++) {       //determined what the best score is
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {       // give grade

            System.out.printf("\nStudent %d score is %d and grade is %s",i,scores[i],getGrade(scores[i],best));
        }

    }

    public  static char getGrade(int score, int best){ // returns a grade determined by the best score

        if(score >= best-10){
            return 'A';
        }else if(score >= best-20){
            return 'B';
        }else if(score>= best-30){
            return 'C';
        }else if(score >= best-40){
            return 'D';
        }else return 'F';


    }
}

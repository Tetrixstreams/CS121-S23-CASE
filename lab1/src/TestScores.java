import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Test score 1: ");
        int score1 = console.nextInt();
        System.out.println("Test score 2: ");
        int score2 = console.nextInt();
        System.out.println("Test score 3: ");
        int score3 = console.nextInt();
        int score4 = 3;
        System.out.printf("Average test score: ");
        String average = String.valueOf((score1 + score2 + score3 / score4));
        System.out.println(average);
        String letterGrade = "A";
        if(score1 >= 90) {
            letterGrade = "A";
        }
        else if(score1 >= 80) {
            letterGrade = "B";
        }
        else if(score1 >= 70) {
            letterGrade = "C";
        }
        else if (score1 >= 60) {
            letterGrade = "D";
        }
        else if(score1 >= 50) {
            letterGrade = "F";
        }
        System.out.println("Your grade is: ");
        System.out.println(letterGrade);
        if(score2 >= 90) {
            letterGrade = "A";
        }
        else if(score2 >= 80) {
            letterGrade = "B";
        }
        else if(score2 >= 70) {
            letterGrade = "C";
        }
        else if (score2 >= 60) {
            letterGrade = "D";
        }
        else if(score2 >= 50) {
            letterGrade = "F";
        }
        System.out.println("Your grade is: ");
        System.out.println(letterGrade);
        if(score3 >= 90) {
            letterGrade = "A";
        }
        else if(score3 >= 80) {
            letterGrade = "B";
        }
        else if(score3 >= 70) {
            letterGrade = "C";
        }
        else if (score3 >= 60) {
            letterGrade = "D";
        }
        else if(score3 >= 50) {
            letterGrade = "F";
        }
        System.out.println("Your grade is: ");
        System.out.println(letterGrade);
    }
}

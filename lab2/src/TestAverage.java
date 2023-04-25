import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int avgScore = 0;

        int score = 0;
        System.out.println("How many students are in the class");
        int students = Integer.parseInt(console.nextLine());
        System.out.println("How many tests per student");
        int tests = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= students ;i++) {
            int totalScore = 0;
            for (int j = 1; j <= tests; j++)
            {
                System.out.println(tests);
                System.out.println("\n");
                System.out.printf("Enter score %d for students %d", j, i);
                score = Integer.parseInt(console.nextLine());
            }
            totalScore += score;

            avgScore = (totalScore / tests);
            System.out.printf("Score for test %d", tests);
            System.out.printf("\nYour average test score is %d", avgScore);
        }
    }
}

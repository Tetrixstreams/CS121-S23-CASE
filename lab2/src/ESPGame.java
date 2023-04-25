import java.util.Scanner;
import java.util.Random;
public class ESPGame {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Random random = new Random();
        int number;
        String color = null;
        String guess;
        int correct = 0;

       for (int i = 1; i <= 10 ; i++) {
           number = random.nextInt(5);
           if (number == 0) {
               color = "red";
           } else if (number == 1) {
               color = "blue";
           } else if (number == 2) {
               color = "green";
           } else if (number == 3) {
               color = "orange";
           } else if (number == 4) {
               color = "yellow";
           }

           System.out.printf("%d. What color has the computer chosen\n", i);
           guess = console.nextLine();
           System.out.printf(">The computer chose %s\n", color);
           if (guess.equals(color)) {
               correct++;
           }

            
       }
       System.out.printf("You got %d out of 10 correct", correct);
    }
}

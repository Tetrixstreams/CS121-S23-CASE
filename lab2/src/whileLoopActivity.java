import java.util.Scanner;
import java.util.Random;
public class whileLoopActivity {
    private static Scanner randomNumber;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.println("Guess a number between 1 and 100");
        int number = -1;
        int randomNumbers = randomNumber.nextInt(100) + 1;

        String numbers = "0";
        int numberss = 0;
        while (number != randomNumbers) {
            numbers = console.nextLine();
            if (numbers.equals("q")) {
                System.out.println("Press q to quit " + randomNumbers);
                break;
            }
            else {
                number = Integer.parseInt(numbers);
                if (number < randomNumbers) {
                    System.out.println("Your number is too low");
                    numberss++;
                }
                else if (number > randomNumbers) {
                    System.out.println("Your number is too high");
                    numberss++;
                }
                else {
                    System.out.println("That's the number");
                    numberss++;
                    System.out.print("Number of guesses: " + numberss);
                    break;
                }

            }

        }

    }
}

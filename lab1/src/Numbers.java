import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int firstNumber = console.nextInt();
        System.out.println("Please enter a second number: ");
        int secondNumber = console.nextInt();
        int added = (firstNumber + secondNumber);
        System.out.printf("Added: ", added);
        System.out.println(added);
        int subtract = (firstNumber - secondNumber);
        System.out.printf("Subtracted: ", subtract);
        System.out.println(subtract);
        int multiply = (firstNumber * secondNumber);
        System.out.printf("Multiplied: ", multiply);
        System.out.println(multiply);
        int divide = (firstNumber / secondNumber);
        System.out.printf("Divided: ", divide);
        System.out.println(divide);
        int square = (int) Math.sqrt(firstNumber);
        System.out.printf("Square Root1: ", square);
        System.out.println(square);
        int square2 = (int) Math.sqrt(secondNumber);
        System.out.printf("Square Root2: ", square);
        System.out.println(square2);
        int power = (int) Math.pow(firstNumber, secondNumber);
        System.out.printf("Power: ", power);
        System.out.println(power);
        int loga = (int) Math.log(firstNumber);
        System.out.printf("Logarithm1: ", loga);
        System.out.println(loga);
        int loga2 = (int) Math.log(secondNumber);
        System.out.printf("Logarithm2: ", loga2);
        System.out.println(loga2);
    }
}

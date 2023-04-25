import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String parity;
        int number = 0;
        System.out.println("Pick a number ");
        number = console.nextInt();
        if (number % 2 == 0){
            parity = "even";
        }
        else {
            parity = "odd";
        }

        System.out.println(parity);

        String even = String.valueOf(2);
        String odd = String.valueOf(1);


    }
}

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);



        System.out.println("how many books have you purchased? ");
        int books = console.nextInt();
        int points = 0;


        if(books == 0) {
            points = 0;
        }
        else if(books == 1) {
            points = 5;
        }
        else if(books == 2) {
            points = 15;
        }
        else if (books == 3) {
            points = 30;
        }
        else if(books == 4) {
            points = 60;
        }
        System.out.printf("You have this many points: ", points);
        System.out.println(points);

    }
}

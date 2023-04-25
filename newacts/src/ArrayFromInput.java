import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final int LENGTH = 3;

        String[]name = new String [LENGTH];
        String[]type = new String [LENGTH];
        int[]number = new int [LENGTH];

        for (int i=0; i<LENGTH; i++) {
            System.out.printf("name your phone %d\n", (i+1));
            System.out.println("type in phone name");
            name[i] = console.nextLine();
            System.out.println("type in phone type");
            type[i] = console.nextLine();
            System.out.println("type in phone number");
            number[i] = Integer.parseInt(console.nextLine());
            System.out.println();


        }

        System.out.printf("\n%-14s %-14s %s", "name", "type", "number");
            for (int i=0; i<LENGTH; i++) {
                System.out.printf("\n%-14s %-14s %d", name[i],type[i],number[i]);

        }



    }
}

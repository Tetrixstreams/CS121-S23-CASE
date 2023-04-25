import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Triangle side 1: ");
        int tri1 = console.nextInt();
        System.out.println("Triangle side 2: ");
        int tri2 = console.nextInt();
        System.out.println("Triangle side 3: ");
        int tri3 = console.nextInt();

        if (tri1 == tri2 || tri1 == tri3 || tri2 == tri3) {
            System.out.println("This is an isosceles triangle");
        }
        else if (tri1 == tri2 && tri1 == tri3) {
            System.out.println("This is an equilateral triangle");
        }
        else System.out.println("This is an scalene triangle");

    }
}

import java.util.Scanner;

public class MethodsActivity {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        console.close();
    }
        public static double getLength() {
            System.out.println("WHat will the length be");
            double length = Integer.parseInt(console.nextLine());
            return length;
        }


        public static double getWidth() {
            System.out.println("What will the width be");
            double width = Integer.parseInt(console.nextLine());
            return width;
        }
    public static double getArea(double length, double width) {
        return length * width;
    }
    public static void displayData(double length, double width, double area) {
        System.out.printf("The length is %.1f\n", length);
        System.out.printf("The width is %.1f\n", width);
        System.out.printf("The area is %.1f\n", area);
    }
}


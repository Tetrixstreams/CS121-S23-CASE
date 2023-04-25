import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TotalCalories totalCalories = new TotalCalories();
        totalCalories.displayTotalCalories();
        Scanner scanner = new Scanner(System.in);

        System.out.println("amount of calories allowed per day by a diet");
        double rate = Double.parseDouble(scanner.nextLine());
        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");


        System.out.println("Enter the day the diet will start: mm/dd/yyyy:");
        String startDate = scanner.nextLine();
        System.out.println("Enter the day the diet will end: mm/dd/yyyy:");
        String endDate = scanner.nextLine();
    }
}
// can't get TotalCalories to run despite calling it and trying to display it, can't figure it out.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
public class TotalCalories {
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    public double calcTotalCalories(double rate, String pickupDate, String returnDate) {
        int days = 0;
        try {
            Date date1 = dateFormat.parse(pickupDate);
            System.out.println("start date: " + date1);
            Date date2 = dateFormat.parse(returnDate);
            System.out.println("end date: " + date2);
            long calories = date2.getTime() - date1.getTime();
            System.out.println("calories: " + calories);
            days = (int) TimeUnit.DAYS.convert(calories, TimeUnit.MILLISECONDS);
            System.out.println("difference converted to days: " + days);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return rate * days;
    }
    public void displayTotalCalories() {
        calcTotalCalories(double rate, String pickupDate, String returnDate);
    }
}

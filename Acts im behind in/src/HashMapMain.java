import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    HashMaps hash = new HashMaps();
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("barry", 37);
        scores.put("luis", 86);
        scores.put("amygdala", 1);

        System.out.println(scores);

        System.out.println("Pick a number 1-10");
        int number = Integer.parseInt((console.nextLine()));
        if (number < 5) {
            System.out.println("Goodbye barry");
            scores.remove("barry");
        } else if (number > 5) {
            System.out.println("Goodbye luis");
            scores.remove("luis");
            } else {
            System.out.println("Goodbye amygdala");
            scores.remove("amygdala");
        }
        System.out.println(scores);

    }
}

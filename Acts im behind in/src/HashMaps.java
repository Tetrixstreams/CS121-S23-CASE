import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Test");
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        System.out.println("add to the scores");

        String name = (console.nextLine());
        int score = Integer.parseInt(console.nextLine());
        System.out.println(name + "s score: " + score);
        scores.put("tim", 45);
        scores.put("jane", 6);
        scores.put("lian", 24);

        int TimScore = scores.get("tim");
        int JaneScore = scores.get("jane");

        System.out.println("Tims score: " + TimScore);
        System.out.println("Janes score: " + JaneScore);

        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println(key + "'s score: " + value);

            scores.remove("lian");
        }
    }
}

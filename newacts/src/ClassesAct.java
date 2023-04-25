import java.util.Scanner;

public class ClassesAct {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        Class2 greg = new Class2(5, "dogs", "indigo" );
        System.out.println("Whats your balloons amount, type, and color");
        int amount = Integer.parseInt(console.nextLine());
        String animal = console.nextLine();
        String color = console.nextLine();
        greg.color("porple");
        System.out.println("You have " + amount + " balloons, a " + animal + ", and a " + color + " balloon");
        System.out.println("Your " + amount + " balloons color is now " + greg.color);
        System.out.println("Whats your height, weight, and name");
        int height = Integer.parseInt(console.nextLine());
        int weight = Integer.parseInt(console.nextLine());
        String name = console.nextLine();
        FootballPlayer paul = new FootballPlayer(height, weight, name);
        paul.height(String.valueOf(5));
        System.out.println("You are able to be a football player with the height " + height + ", weight " + weight + ", and name " + name);
    }
}

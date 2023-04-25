import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Whats your favorite fruit? apple, orange, banana, grapes");
        String fruits = console.nextLine();
        switch (fruits)
        {
            case "apple":
                System.out.println("In Greek mythology, apples are regarded as precious and sometimes magical.");
                System.out.println("There is a giant apple-shaped building known as Mr. Applehead in Colborne.");
                System.out.println("Apple bobbing is a traditional game played around Halloween.");
                break;
            case "orange":
                System.out.println("The Orange Capital of the World! Brazil is the largest producer of this fruit.");
                System.out.println("Oranges are not wild!");
                System.out.println("Although, oranges are currently the largest citrus crop in the world, the sweet oranges popular in the United States today first came from China.");
                break;
            case "banana":
                System.out.println("Scorpions used to hide in banana bunches, travel the world, and attack people on the docks.");
                System.out.println("There was a myth that eve ate a banana instead of the apple.");
                System.out.println("A single banana would be called a finger.");
                break;
            case "grapes":
                System.out.println("Brought From Spain. Spanish explorers introduced the fruit to America about 300 years ago.");
                System.out.println("They're Berries! Yes, grapes are a kind of berry.");
                System.out.println("The Grape Family. There are more than 8,000 grape varieties from about 60 species.");
                break;
            default:
                System.out.println("Error: Invalid fruit");
                break;
        }


    }
}

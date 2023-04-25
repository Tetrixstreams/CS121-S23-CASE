import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        System.out.println("Is anyone in your party a vegetarian?");
        String vegetarian = console.nextLine();
        System.out.println("Is anyone in your party vegan?");
        String vegan = console.nextLine();
        System.out.println("Is anyone in your party gluten-free?");
        String gluten = console.nextLine();




        if (vegan.equals("yes")) {
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else if (gluten.equals("yes")) {
            System.out.println("Main street pizza company");
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else if (vegetarian.equals("yes") && vegan.equals("yes")) {
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else if (vegan.equals("yes") && gluten.equals("yes")) {
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else if (vegetarian.equals("yes") && vegan.equals("yes") && gluten.equals("yes")) {
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else if (vegetarian.equals("yes") && gluten.equals("yes")) {
            System.out.println("Main street pizza company");
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
        }
        else {
            System.out.println("Main street pizza company");
            System.out.println("Corner cafe");
            System.out.println("The Chefs Kitchen");
            System.out.println("Mamas fine italian");
        }
    }
}

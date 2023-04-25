import java.util.Random;
import java.util.Scanner;

public class PokemonSelection {
    Scanner console = new Scanner(System.in);
    public Pokemon createPokemon() {

                System.out.println("What is his name");
                String name = console.nextLine();
                System.out.println("What are his hit points");
                int hp = Integer.parseInt(console.nextLine());
                System.out.println("What is his move");
                String move = console.nextLine();
                System.out.println("What are his moves power");
                int power = Integer.parseInt(console.nextLine());
                System.out.println("Whats his attack speed");
                int speed = Integer.parseInt(console.nextLine());
                System.out.println();
                return new Pokemon(name, hp, move, power, speed);
            }



    public void assignPokemon() {
        System.out.println("Player 1: Select a Pokemon and enter its stats");
        Pokemon pokemon1 = createPokemon();
        System.out.println();

        System.out.println("Player 2: Select a Pokemon and enter its stats");
        Pokemon pokemon2 = createPokemon();
        System.out.println();

        System.out.println("PLayer 1 Pokemon");
        System.out.println("----------------");
        System.out.println(pokemon1.displayPokemonStats());
        System.out.println();

        System.out.println("PLayer 2 Pokemon");
        System.out.println("----------------");
        System.out.println(pokemon1.displayPokemonStats());
        System.out.println();

        console.close();
    }



}




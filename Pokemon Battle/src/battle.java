import java.util.Scanner;
import java.util.Random;
public class battle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int number;
        int win = 0;
        int win2 = 0;
        System.out.println("Pokemon Battle!");
        System.out.println("Pick an odd number for amount of rounds");
        int rounds = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= rounds; i++){
            System.out.println("Pick a Pokemon");
            String pokemon = console.nextLine();
            System.out.println("enter pokemon1 stats");
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
            System.out.println("Pick a Pokemon");
            String pokemon2 = console.nextLine();
            System.out.println("enter pokemon1 stats");
            System.out.println("What is his name");
            String name2 = console.nextLine();
            System.out.println("What are his hit points");
            int hp2 = Integer.parseInt(console.nextLine());
            System.out.println("What is his move");
            String move2 = console.nextLine();
            System.out.println("What are his moves power");
            int power2 = Integer.parseInt(console.nextLine());
            System.out.println("Whats his attack speed");
            int speed2 = Integer.parseInt(console.nextLine());
            System.out.println();

            // while (!(hp < 1) || !(hp2 < 1))
            //------ changed
            while (!(hp < 1) && !(hp2 < 1)) {
                //if (speed >= speed2)
                // changed ---
                if (speed > speed2) {
                    System.out.println("Player 1’s Pokemon has higher speed");
                    //??
                    //System.out.println(hp2 - power);
                    hp2 -= power;
                    if (hp2 < 1) {
                        win++;
                        System.out.println("Player 1 wins round");
                        break;
                    }
                    //else if (hp < 1) {
                    // changed ----
                    hp -= power2;
                    if (hp < 1) {
                        //System.out.println(hp - power2);
                        win2++;
                        System.out.println("Player 2 wins round");
                        break;
                    }
                }
                //else  {
                //changed----
                else if (speed2 > speed) {
                    System.out.println("Player 2's Pokemon has higher speed");
                    //System.out.println(hp - power2);
                    hp -= power2;
                    if (hp < 1) {
                        win2++;
                        System.out.println("Player 2 wins round");
                        break;
                    }
                    //else {
                    //changed ---
                    //System.out.println(hp2 - power);
                    hp2 -= power;
                    if (hp2 < 1) {
                        //win2++;
                        // changed--
                        win++;
                        System.out.println("Player 2 wins round");
                        break;
                    }
                }
                //if (speed == speed2) {
                //changed ---
                else {
                    //for (int i = 1; i <= 2; i++)
                    //{
                    number = random.nextInt(2);
                    //??

                    if (number == 0) {
                        //System.out.println(hp2 - power);
                        hp2 -= power;
                        if (hp2 < 1) {
                            System.out.println("Player 1 goes first");
                            //added
                            win++;
                        }
                        hp -= power2;
                        if (hp < 1) {
                            //System.out.println(hp - power2);

                            System.out.println("Player 1 wins round");
                            win2++;
                            //break;
                        }
                    } else {
                        //System.out.println(hp - power2);
                        hp -= power2;
                        if (hp < 1) {
                            System.out.println("Player 2 wins round");
                            win2++;

                        }
                        //System.out.println(hp2 - power);
                        hp2 -= power;
                        if (hp2 < 1) {
                            System.out.println("Player 1 wins round");
                            win++;
                        }

                    }

                }
            }
            System.out.println("Player one won " + win + "  rounds");
            System.out.println("Player two won " + win2 + " rounds");
            if (win > win2) {
                System.out.println("Player one wins with " + win + "  rounds");
            } else {
                System.out.println("Player two wins with " + win2 + "  rounds");
            }
        }
    }
}
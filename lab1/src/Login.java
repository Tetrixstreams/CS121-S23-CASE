import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String userName = "davidcase";
        String password = "Monkeys";
        System.out.println("What is your username: ");
        String name = console.nextLine();
        System.out.println("What is your password: ");
        String pw = console.nextLine();

        if (name.equals(userName) && pw.equals(password)) {
            System.out.println("Welcome to CS121");
        }
        else if (name.equals(userName) && !pw.equals(password)) {
            System.out.println("password was incorrect");
        }
        else if (!name.equals(userName) && pw.equals(password)) {
            System.out.println("username was inccorect");
        }
        else {
            System.out.println("username and password are incorrect");
        }
    }
}

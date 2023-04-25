import java.util.Scanner;

public class consoleInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = console.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = console.nextLine();
        String fullName = (firstName + lastName);
        String fullNameUpper = fullName.toUpperCase();
        System.out.println(fullNameUpper);
        System.out.println("Enter your first name: ");
        String fullNameLower = fullName.toLowerCase();
        System.out.println(fullNameLower);
        System.out.printf("Full name: %s %s", firstName, lastName);
        System.out.printf(reverse(fullName));



    }
    public static String reverse(String name){
        String newName = "";
        for(int i = name.length()-1; i >= 0; i--){
            newName += name.charAt(i);
        }
        return newName;
    }
}



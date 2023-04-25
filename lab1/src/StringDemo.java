public class StringDemo {
    public static void main(String[] args) {
        String name = "John" + " " + "Doe";
        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.format("%s %s,", firstName, lastName);
        int age = 20;
        double gpa = 3.8;
        char letterGrade = 'A';
        String info =String.format("\nname: %s, \nage: %d, \ngpa: %.1f, \ngrade: %c", fullName, age, gpa, letterGrade);
        System.out.println(info);
        System.out.println();
        System.out.printf("\nname: %s, \nage: %d, \ngpa: %.1f, \ngrade: %c", fullName, age, gpa, letterGrade);
    }
}
//System.out.println(firstName + " " + lastName);
//        System.out.println();
//        System.out.println(fullName);
 //       System.out.println();
 //       System.out.println("name: " + name + ",age: " + age + ",gpa: " + gpa + ",grade: " + letterGrade);
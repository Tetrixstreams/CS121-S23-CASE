import java.util.*;
public class StudentSet {
    private Set<String> student = new HashSet<>();
    static Scanner console = new Scanner(System.in);

    public void addStudents() {
        while (true) {
            System.out.println("Add to the list or enter q to quit");
            String students = console.nextLine();

            if (students.toLowerCase().equals("q")) {
                break;
            } else {
                student.add(students);
            }



        }

    }

    public void displayStudents() {
       // Iterator<String> it = students.iterator[];
        //while (true) { println("%s" students);

        }
    }

//}
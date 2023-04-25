import java.io.*;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        File file = new File("MyCourses.txt");
        try {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
        }
            catch (FileNotFoundException e) {
    System.err.println("file not found");
            }
        }
    }


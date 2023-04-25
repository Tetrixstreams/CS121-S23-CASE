import java.util.ArrayList;
public class GenericMethod {
    public void printArrayList(ArrayList array) {
        for (int i=0; i< array.size(); i++) {
            System.out.print(array.get(i) + " ");

        }
    }
}
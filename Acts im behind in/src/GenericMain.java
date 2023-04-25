import java.util.*;
public class GenericMain {
    public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );
        ArrayList<Double> doubles = new ArrayList<>(
                Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5)
        );
        ArrayList<Character> characters = new ArrayList<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e')
        );
        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("alpha", "beta", "charlie", "delta", "epsilon")
        );
        GenericMethod Generic = new GenericMethod();

        Generic.printArrayList(integers);
        System.out.println();
        Generic.printArrayList(doubles);
        System.out.println();
        Generic.printArrayList(characters);
        System.out.println();
        Generic.printArrayList(strings);
        System.out.println();

    }
}

public class Mainist {
    public static void main(String[] args) {
        Sortingist sortor = new Sortingist();
        int[] unsortedArray = sortor.getArray();
        System.out.println(sortor.show(unsortedArray));
        int[] sortedArray = sortor.sortArray(unsortedArray);
        System.out.println(sortor.show(sortedArray));
    }
}
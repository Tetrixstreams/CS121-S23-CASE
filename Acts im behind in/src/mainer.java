public class mainer {
    public static void main(String[] args) {
        Sorting sortor = new Sorting();
        int[] unsortedArray = sortor.getArray();
        System.out.println(sortor.show(unsortedArray));
        int[] sortedArray = sortor.sortArray(unsortedArray, 0, 5);
        System.out.println(sortor.show(sortedArray));
    }
}

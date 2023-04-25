import java.util.Scanner;
public class Sortingist {
    static Scanner console = new Scanner(System.in);


    public int[] getArray() {
        System.out.println("Add to the list");
        String getArray = console.nextLine();

        System.out.println("Enter Integer 1: ");
        int integer1 = Integer.parseInt(console.nextLine());
        System.out.println("Enter Integer 2: ");
        int integer2 = Integer.parseInt(console.nextLine());
        System.out.println("Enter Integer 3: ");
        int integer3 = Integer.parseInt(console.nextLine());
        System.out.println("Enter Integer 4: ");
        int integer4 = Integer.parseInt(console.nextLine());
        System.out.println("Enter Integer 5: ");
        int integer5 = Integer.parseInt(console.nextLine());
        System.out.println("Enter Integer 6: ");
        int integer6 = Integer.parseInt(console.nextLine());

        int integers[] = {integer1, integer2, integer3, integer4, integer5, integer6};
        return integers;

    }
        public int[] sortArray(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }

                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            return array;
        }
    public String show(int[] array) {
        String display = "";
        for(int i = 0; i < array.length; i++) {
            if(i < array.length-1) {
                display += array[i] + ", ";
            }
            else {
                display += array[i];
            }
        }
        return display;
    }
}

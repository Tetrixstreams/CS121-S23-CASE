import java.util.Scanner;

public class Sorting {
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

    public int[] sortArray(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sortArray(array, left, mid);
            sortArray(array, mid + 1, right);
            merge(array, left, mid, right);

        }
        return array;
    }


            //HELPER FUNCTION --> TAKES THE ELEMENTS AND PUT THEM BACK IN THE SAME ARRAY.
            //START AT LEFT then going to right.
            public void merge ( int[] arr, int left, int mid, int right){
                // Find sizes of two subarrays to be merged
                int n1 = mid - left + 1;
                int n2 = right - mid;
                // Create temporary arrays
                int[] leftArr = new int[n1];
                int[] rightArr = new int[n2];
                // Copy data to temporary arrays
                for (int i = 0; i < n1; i++) {
                    leftArr[i] = arr[left + i];
                }
                for (int j = 0; j < n2; j++) {
                    rightArr[j] = arr[mid + 1 + j];
                }
                // Merge the temporary arrays
                int i = 0, j = 0;
                int k = left;
                while (i < n1 && j < n2) {
                    if (leftArr[i] <= rightArr[j]) {
                        arr[k] = leftArr[i];
                        i++;
                    } else {
                        arr[k] = rightArr[j];
                        j++;
                    }
                    k++;
                }
                // Copy remaining elements of leftArr if any
                while (i < n1) {
                    arr[k] = leftArr[i];
                    i++;
                    k++;
                }
                // Copy remaining elements of rightArr if any
                while (j < n2) {
                    arr[k] = rightArr[j];
                    j++;
                    k++;
                }
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





import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][][] numbers = new int[3][3][3];
        numbers[0][0][0] = 1;
        numbers[0][0][1] = 2;
        numbers[0][0][2] = 3;
        numbers[0][1][0] = 4;
        numbers[0][1][1] = 4;
        numbers[0][1][2] = 6;
        numbers[0][2][0] = 7;
        numbers[0][2][1] = 8;
        numbers[0][2][2] = 9;
        numbers[1][0][0] = 10;
        numbers[1][0][1] = 11;
        numbers[1][0][2] = 12;
        numbers[1][1][0] = 13;
        numbers[1][1][1] = 14;
        numbers[1][1][2] = 15;
        numbers[1][2][0] = 16;
        numbers[1][2][1] = 17;
        numbers[1][2][2] = 18;
        numbers[2][0][0] = 19;
        numbers[2][0][1] = 20;
        numbers[2][0][2] = 21;
        numbers[2][1][0] = 22;
        numbers[2][1][1] = 23;
        numbers[2][1][2] = 24;
        numbers[2][2][0] = 25;
        numbers[2][2][1] = 26;
        numbers[2][2][2] = 27;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.printf("number at position (%d, %d, %d): %d\n", i, j, k, numbers[i][j][k]);
                }
            }
        }


    }}

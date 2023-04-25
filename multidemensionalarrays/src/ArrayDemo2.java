import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int[][][][] number = new int [3][3][3][3];

        number[0][0][0][0] = 1;
        number[0][0][0][1] = 2;
        number[0][0][0][2] = 3;
        number[0][0][1][0] = 4;
        number[0][0][1][1] = 4;
        number[0][0][1][2] = 6;
        number[0][0][2][0] = 7;
        number[0][0][2][1] = 8;
        number[0][0][2][2] = 9;
        number[0][1][0][0] = 10;
        number[0][1][0][1] = 11;
        number[0][1][0][2] = 12;
        number[0][1][1][0] = 13;
        number[0][1][1][1] = 14;
        number[0][1][1][2] = 15;
        number[0][1][2][0] = 16;
        number[0][1][2][1] = 17;
        number[0][1][2][2] = 18;
        number[0][2][0][0] = 19;
        number[0][2][0][1] = 20;
        number[0][2][0][2] = 21;
        number[0][2][1][0] = 22;
        number[0][2][1][1] = 23;
        number[0][2][1][2] = 24;
        number[0][2][2][0] = 25;
        number[0][2][2][1] = 26;
        number[0][2][2][2] = 27;
        number[1][0][0][0] = 28;
        number[1][0][0][1] = 29;
        number[1][0][0][2] = 30;
        number[1][0][1][0] = 31;
        number[1][0][1][1] = 32;
        number[1][0][1][2] = 33;
        number[1][0][2][0] = 34;
        number[1][0][2][1] = 35;
        number[1][0][2][2] = 36;
        number[1][1][0][0] = 37;
        number[1][1][0][1] = 38;
        number[1][1][0][2] = 39;
        number[1][1][1][0] = 40;
        number[1][1][1][1] = 41;
        number[1][1][1][2] = 42;
        number[1][1][2][0] = 43;
        number[1][1][2][1] = 44;
        number[1][1][2][2] = 45;
        number[1][2][0][0] = 46;
        number[1][2][0][1] = 47;
        number[1][2][0][2] = 48;
        number[1][2][1][0] = 49;
        number[1][2][1][1] = 50;
        number[1][2][1][2] = 51;
        number[1][2][2][0] = 52;
        number[1][2][2][1] = 53;
        number[1][2][2][2] = 54;
        number[2][0][0][0] = 55;
        number[2][0][0][1] = 56;
        number[2][0][0][2] = 57;
        number[2][0][1][0] = 58;
        number[2][0][1][1] = 59;
        number[2][0][1][2] = 60;
        number[2][0][2][0] = 61;
        number[2][0][2][1] = 62;
        number[2][0][2][2] = 63;
        number[2][1][0][0] = 64;
        number[2][1][0][1] = 65;
        number[2][1][0][2] = 66;
        number[2][1][1][0] = 67;
        number[2][1][1][1] = 68;
        number[2][1][1][2] = 69;
        number[2][1][2][0] = 70;
        number[2][1][2][1] = 71;
        number[2][1][2][2] = 72;
        number[2][2][0][0] = 73;
        number[2][2][0][1] = 74;
        number[2][2][0][2] = 75;
        number[2][2][1][0] = 76;
        number[2][2][1][1] = 77;
        number[2][2][1][2] = 78;
        number[2][2][2][0] = 79;
        number[2][2][2][1] = 80;
        number[2][2][2][2] = 81;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.printf("number at position (%d, %d, %d, %d): %d\n", i, j, k, number[i][j][k][l]);
                    }
                }
            }
        }}
}

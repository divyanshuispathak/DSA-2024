package Arrays;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[][] arr = new int[3][];
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        int[][] arr = new int[3][3];

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    }
}

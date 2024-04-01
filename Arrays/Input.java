package Arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of PRIMITIVES
        // int[] arr = new int[5];
        // arr[0] = 12;
        // arr[1] = 45;
        // arr[2] = 34;
        // arr[3] = 56;
        // arr[4] = 79;

        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr)); -> Another way of printing the element of an array

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // For each loop in java
        // for(int element : arr) {
        //     System.out.print(element + " ");
        // }


        // Array of objects
        String[] str = new String[4];

        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        for(String element: str) {
            System.out.print(element + " ");
        }

    }
}

package Basics2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter the Number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for(int i = 1; i < num ; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(sum);
    }
}

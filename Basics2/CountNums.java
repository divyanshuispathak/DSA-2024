package Basics2;

public class CountNums {
    public static void main(String[] args) {
        int num = 433389333;
        int count = 0;

        while(num > 0) {
            if(num % 10 == 3) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
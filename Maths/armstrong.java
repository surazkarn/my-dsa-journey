// Given a number, check if it is Armstrong Number or Not.
//Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value  of n:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        while (n > 0) {

            int va = n % 10;
            sum = sum + va * va * va;
            n = n / 10;

        }
        if (temp == sum)
            System.out.println("Yes Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}

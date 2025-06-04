package userdefined;

import java.util.Scanner;

public class sumoftwonumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of int a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of int B:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Value of a and b= " + sum);
    }
}
package userdefined;

import java.util.Scanner;

public class Product {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of int a: ");
    int a= sc.nextInt();
    System.out.print("Enter the value of int b: ");
    int b= sc.nextInt();
    int pro = a*b;
    System.out.println("The value of a*b is:" + pro);
}
}

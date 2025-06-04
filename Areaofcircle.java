package userdefined;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        double r = sc.nextInt();
        double tfor = pi * r * r;

        System.out.println("Area of circle= " + tfor);

    }
}

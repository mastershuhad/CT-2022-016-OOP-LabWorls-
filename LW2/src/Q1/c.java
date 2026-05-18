package Q1;

import java.util.Scanner;
import java.math.*;

public class c {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of X: ");
            double X = sc.nextDouble();

            System.out.print("Enter value of Y: ");
            double Y = sc.nextDouble();

            double result = Math.cbrt(X * Y);
            System.out.println("Cube root of (X * Y) = " + result);
            sc.close();

    }
}
package Q1;

import java.util.*;

public class d {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of the circle: ");
            double r = sc.nextDouble();

            double area = Math.PI * r * r;

            System.out.println("Area of the circle = " + area);
            sc.close();
        }
}

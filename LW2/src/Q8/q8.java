package Q8;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double r = sc.nextDouble();

        double PI = 3.14;
        double volume = (4.0 / 3.0) * (PI * Math.pow(r, 3));

        System.out.println("Volume of sphere = " + volume);

        sc.close();
    }
}

package Q9;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter interest rate (R) in %: ");
        double R = sc.nextDouble();

        System.out.print("Enter number of years (N): ");
        int N = sc.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.println("After " + N + " years, your investment grows to: $" + amount);

        sc.close();
    }
}
package Q4;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double bodyWeight = sc.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println("You need " + calories + " calories per day.");

        sc.close();
    }
}

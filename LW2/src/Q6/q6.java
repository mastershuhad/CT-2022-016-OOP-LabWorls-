package Q6;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = sc.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

        sc.close();
    }
}

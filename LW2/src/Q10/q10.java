package Q10;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MONTHS_IN_YEAR = 12;

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int loanPeriod = sc.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("\n--- Loan Summary ---");
        System.out.println("Monthly Payment : $" + monthlyPayment);
        System.out.println("Total Payment   : $" + totalPayment);

        sc.close();
    }
}
package Q2;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        System.out.println("This a program to convert centimeters (input) to feet and inches (output). ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(cm + " cm = " + feet + " feet and " + inches + " inches");
        scanner.close();

    }
}

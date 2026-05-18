package Q7;
import java.util.*;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
    int weight = sc.nextInt();

        System.out.println("Enter height in centimeters: ");
    int height = sc.nextInt();

    double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.println("Your BMI is: " + bmi);

        if (bmi >= 20 && bmi <= 25) {
        System.out.println("Status: Normal");
    } else if (bmi < 20) {
        System.out.println("Status: Underweight");
    } else {
        System.out.println("Status: Overweight");
    }
        sc.close();
}
}

package Q1;
import java.util.Scanner;
import java.math.*;

public class a {
    public static void main(String[] args){
        System.out.println("___________This java program finds Square root of B^2 + 4AC ________________");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Value for A : ");
        double A = sc.nextDouble();

        System.out.println("Enter a Value for B : ");
        double B = sc.nextDouble();

        System.out.println("Enter Value for C : ");
        double C = sc.nextDouble();

        double result = Math.sqrt( B * B + 4*A*C);

        System.out.println("Square root of (B² + 4AC) = "+ result );
    }
}

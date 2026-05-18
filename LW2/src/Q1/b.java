package Q1;
import java.util.*;
import java.math.*;
public class b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value for X : ");
        double X = sc.nextDouble();

        System.out.println("Enter a Value for Y : ");
        double Y = sc.nextDouble();

        double result = Math.sqrt(X + 4*Y*Y*Y);

        System.out.println("Square root of X + 4Y3^3 = "+ result);
    }
}

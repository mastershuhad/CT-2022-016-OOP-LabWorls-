package Q3;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" This program calculate inputs temperature in degrees Celsius and prints out the \n" +
                "temperature in degrees Fahrenheit.");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        sc.close();
    }
}

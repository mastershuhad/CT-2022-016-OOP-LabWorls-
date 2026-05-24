package Q1;
import java.util.Scanner;

//This program convert temperature from Celcius to Fehrenheit.
class Temperature {
    private double celsius;

    // No Arg Constructor
    public Temperature() {
        celsius = 0;
    }

    // Parameterized Constructor
    public Temperature(double C) {
        celsius = C;
    }

    //returns Celsius
    public double toCelsius() {
        return celsius;
    }

    //converts to Fahrenheit
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // sets Celsius
    public void setCelsius(double C) {
        celsius = C;
    }

    //converts Fahrenheit to Celsius
    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }
}

public class TempConvert {
    public static void main(String[] args) {

        System.out.println("This Program Convert Temperature from Celcius to Fehrenheit.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double input = scanner.nextDouble();

        Temperature temp = new Temperature(input);

        System.out.printf("%.2f°C = %.2f°F%n", temp.toCelsius(), temp.toFahrenheit());

        scanner.close();
    }
}
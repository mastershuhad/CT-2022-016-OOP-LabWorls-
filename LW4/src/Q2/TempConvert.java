package Q2;
import java.util.Scanner;
//This program convert temperature from Fehrenheit to Celcius  .
class Temperature {
    private double fehrenheit;
    public Temperature(){
        fehrenheit = 0;
    }
    public Temperature(double F){
         fehrenheit = F;
    }
    public double toFehrenheit(){
        return fehrenheit;
    }
    public double toCelcius(){
        return (fehrenheit-32)*5/9;
    }
    public void setFehrenheit(double F){
        fehrenheit = F ;
    }
    public void setCelcius(double celcius){
        celcius = (fehrenheit-32) * 5 / 9;
    }
}
public class TempConvert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This Program Convert Temperature from Fehrenheit to Celcius.");
        System.out.print("Enter Temperature in Fehrenheit : ");
        double input = sc.nextDouble();

        Temperature temp ;
        temp = new Temperature();

        temp.setFehrenheit(input);
        temp.setCelcius(input);
        System.out.printf("%.2f°F = %.2f°C",temp.toFehrenheit(),temp.toCelcius());



    }
}

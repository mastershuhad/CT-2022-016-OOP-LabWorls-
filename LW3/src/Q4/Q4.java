package Q4;
import java.util.Scanner;
import java.math.*;

public class Q4 {
    public static void main(String[] args){
        System.out.println("Java program that replies either Leap Year or Not a Leap Year ");

        Scanner sc = new Scanner(System.in);

        System.out.print(" \nEnter a year to check that a leap year : ");
        int year = sc.nextInt();

       String result = ( year%4 == 0 && year%100 != 0)? "yes":(year%4 == 0 && year%100 == 0 && year%400 == 0)?"yes":"no";

       switch (result){
           case "yes":
               System.out.println( year + " is a leap year ");
               break;
           case "no":
               System.out.println( year + " is not a leap year ");
               break;
       }

    sc.close();
    }
}

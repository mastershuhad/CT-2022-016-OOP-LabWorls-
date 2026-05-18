package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        System.out.println(" This Java program that reads a power of 10 (6, 9, 12, etc.) and displays how big the number is (Million, Billion, etc.)." );

        Scanner sc = new Scanner(System.in);
        System.out.println(" Power of 10 \t " + "Number  \n" +
                "\t6   \t \t" + "Million  \n" +
                "\t9   \t \t" + "Billion  \n" +
                "\t12  \t  \t" +  "Trillion  \n" +
                "\t15   \t \t" + "Quadrillion  \n" +
                "\t18  \t  \t" +   "Quintillion  \n" +
                "\t21   \t \t" +   "Sextillion  \n" +
                "\t30   \t \t" +  "Nonillion  \n" +
                "\t100  \t  \t" +    "Googol");

        System.out.print(" Enter power of ten from above table : ");
        int power = sc.nextInt();

        switch (power) {
            case 6 :
                System.out.println(" Million");
                break;
            case 9 :
                System.out.println(" Billion");
                break;
            case 12 :
                System.out.println(" Trillion");
                break;
            case 15:
                System.out.println(" Quadrillion");
                break;
            case 18:
                System.out.println(" Quintillion");
                break;
            case 21:
                System.out.println(" Sextillion");
                break;
            case 30:
                System.out.println(" Nonillion");
                break;
            case 100:
                System.out.println(" Googol");
                break;
        }


    }
}

package Q11;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your middle name : ");
        String middleName = sc.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = sc.nextLine();

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + '.');
    }
}

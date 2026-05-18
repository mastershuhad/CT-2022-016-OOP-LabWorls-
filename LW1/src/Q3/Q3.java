package Q3;
import java.util.Scanner;

public class Q3{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter first name: ");
        String firstname = input.next();
        System.out.println("Enter middle name: ");
        String middlename = input.next();
        System.out.println("Enter last name: ");
        String lastname = input.next();

        System.out.println(firstname+ " " + middlename.substring(0,1) + ". "+ lastname);


    }

}
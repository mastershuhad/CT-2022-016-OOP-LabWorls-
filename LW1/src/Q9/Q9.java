package Q9;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sen = sc.nextLine();

        int count = sen.length();
        char fisrtL = sen.charAt(0);
        char lastL = sen.charAt(count-1);

        System.out.println(count);
        System.out.println(fisrtL);
        System.out.println(lastL);
    }
}

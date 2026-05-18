package Q10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a word with odd-length : ");
            String word = sc.nextLine();
            int length = word.length();

            if (length % 2 == 1) {
                int middle = length/2;
                System.out.println(word.charAt(middle));
                break;
            }else{
                System.out.println("Entered word is not in Odd-Length ");
            }
        }
    }
}

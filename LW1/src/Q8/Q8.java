package Q8;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with a Exclamation mark in the middle: ");
        String sentence = sc.nextLine();

        int index = sentence.indexOf("!");

        String stOne = sentence.substring(0, index);
        String stTwo = sentence.substring(index+1);

        System.out.println(stOne);
        System.out.println(stTwo);

    }
}

package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        System.out.println(" This java program find the smallest of three integer using switch statement\n");
        Scanner sc = new Scanner(System.in);

        int A , B, C ;
        System.out.println("Enter your fisrt number : ");
        A = sc.nextInt();
        System.out.println("Enter your second number : ");
        B = sc.nextInt();
        System.out.println("Enter your third number : ");
        C = sc.nextInt();

        int smallestNo = ( A < B && A < C)? 1:(B < A && B < C)?2: 3;
        switch (smallestNo){
            case 1:
                System.out.println(" The smallest number is " + A);
                break;
            case 2:
                System.out.println(" The smallest number is " + B);
                break;
            case 3 :
                System.out.println(" The smallest number is " + C);
                break;

        }
        sc.close();
    }
}

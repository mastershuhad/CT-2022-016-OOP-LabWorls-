package Q1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        System.out.println(" This java program find the smallest of three integer using if statement\n"                 );

        Scanner sc = new Scanner(System.in);
        int A , B, C ;
        System.out.println("Enter your fisrt number : ");
        A = sc.nextInt();
        System.out.println("Enter your second number : ");
        B = sc.nextInt();
        System.out.println("Enter your third number : ");
        C = sc.nextInt();

        if (A < B ){
            if( C < A){
                System.out.println(" The smallest number is " + C);
                }
            else {
                System.out.println(" The smallest number is "+ A);
            }
        }else if (B < C){
            System.out.println(" The smallest number is B " +B);
        }else{
            System.out.println(" \nThe smallest number is C " +C);
        }

        sc.close();

    }
}

package Q3;
import java.util.Scanner;
import java.math.*;
class Circle {

    private double radius;


    public Circle(double R){
        radius = R;
    }
    public double ComputeArea(){
        return radius*radius*Math.PI;
    }
    public double ComputeCircumference(){
        return 2*radius*Math.PI;
    }

}

public class Compute{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("This  Java program that computes the area of a circular region (the shaded area in the diagram)\n");
       System.out.print("Enter radius of Inner Circle (cm) : ");
       double input1 = sc.nextDouble();
       System.out.print("Enter radius of Outer Shaded Circle (cm) : ");
       double input2 = sc.nextDouble();

       Circle inner = new Circle(input1);

       System.out.printf("Area of Inner Circle is : %.2f cm² \n",inner.ComputeArea());
       System.out.printf("Circumference of Inner Circle is : %.2f cm \n\n",inner.ComputeCircumference());

       Circle outer = new Circle(input2);

       System.out.printf("Area of Inner Circle is : %.2f cm² \n",outer.ComputeArea());
       System.out.printf("Circumference of Inner Circle is : %.2f cm \n\n",outer.ComputeCircumference());

       double shaded = outer.ComputeArea() - inner.ComputeArea();
       System.out.printf("Area of Shaded part is :%.2f cm²",shaded);

    }

}

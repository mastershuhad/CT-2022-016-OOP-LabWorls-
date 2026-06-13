package Q5;
import Q4.*;
import Q1.Pet;
import java.util.ArrayList;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        System.out.println("This Java program that creates an Array of pets.");

        while (true) {
            System.out.print("\nEnter pet name (or STOP to exit): ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Enter type of pet (C for Cat, D for Dog): ");
            String type = scan.nextLine();

            if (type.equalsIgnoreCase("C")) {
                System.out.print("Enter coat color: ");
                String coatColor = scan.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(coatColor);
                pets.add(cat);

            } else if (type.equalsIgnoreCase("D")) {
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                scan.nextLine(); // Consume the newline character left by nextDouble()
                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(weight);
                pets.add(dog);
                dogs.add(dog);
            } else {
                System.out.println("You entered an invalid pet type. Try again.");
            }
        }

        System.out.println("\n--- Dogs Average Weight ---");
        double  totalWeight = 0.0;
        int dogCount = 0;
        for(Pet p: dogs){
                totalWeight += ((Dog) p).getWeight();
        }

        System.out.printf("Dogs Average Weight = %.2f",totalWeight/dogs.size());
        scan.close();
    }
}

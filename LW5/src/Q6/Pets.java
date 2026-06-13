package Q6;
import Q4.*;
import Q1.Pet;
import java.util.ArrayList;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        System.out.println("---This Java program that creates an Array of pets.---");

        while (true) {

            System.out.println("\nChoose the Action :");
            System.out.println("\n\t 1. Add Cat ");
            System.out.println("\t 2. Add Dog ");
            System.out.println("\t 3. Remove Cat ");
            System.out.println("\t 4. Remove Dog ");
            System.out.println("\t 0. Quit");

            System.out.print("\nEnter Choice Number: ");
            String Choice = scan.nextLine();
            String name;

            //Quit
            if (Choice.equals("0")) {
                break;
            }
            //add Cat
            else if (Choice.equals("1")) {
                do {
                    System.out.print("\nEnter cat name: ");
                    name = scan.nextLine();

                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty ");
                    }

                }while (name.isEmpty());

                //prevent entering duplicate cat names
                for (Pet p : cats) {
                    if (name.equals(p.getName())) {
                        System.out.println("You entered a cat name already exists. Enter a different name : ");
                        name = scan.nextLine();
                    }
                }

                System.out.print("Enter coat color: ");
                String coatColor = scan.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(coatColor);
                cats.add(cat);
                pets.add(cat);

            //add Dog
            } else if (Choice.equals("2")) {
                do {
                    System.out.print("\nEnter dog name: ");
                    name = scan.nextLine();

                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty ");
                    }

                }while (name.isEmpty());


                //prevent entering duplicate dog names
                for (Pet p : dogs) {
                    if (name.equals(p.getName())) {
                        System.out.print("Name already exists. Enter a different name : ");
                        name = scan.nextLine();
                    }
                }
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                scan.nextLine();
                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(weight);
                dogs.add(dog);
                pets.add(dog);

            // remove cat
            }else if (Choice.equals("3")) {
                System.out.println("Enter name of cat to remove : ");
                String remove = scan.nextLine();

                for (Pet p : cats) {
                    if (p.equals(remove)) {
                        cats.remove(remove);
                    }
                }

            } else if (Choice.equals("4")) {
                System.out.println("Enter name of cat to remove : ");
                String remove = scan.nextLine();

                for (Pet p : dogs) {
                    if (p.equals(remove)) {
                        cats.remove(remove);
                    }
                }

            } else {
                System.out.println("You entered an invalid Choice. Try again.");
            }
        }
        scan.close();
    }
}
package Q2;

import Q1.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true){
            System.out.print("Enter a pet name (Or 'STOP' to finish): ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print("Enter type(c for cat, d for dog): ");
            String type = scan.nextLine();

            Pet pet;

            if(type.equalsIgnoreCase("c")){
                pet = new Cat();
            }else if (type.equalsIgnoreCase("d")){
                pet = new Dog();
            }else {
                System.out.println("Invalid type Entered! Try again. ");
                continue;
            }
            pet.setName(name);
            pets.add(pet);

        }
        System.out.println("\n--- Pet List ---");

        ArrayList<String> catNames = new ArrayList<>();
        ArrayList<String> dogNames = new ArrayList<>();

        for(Pet p: pets){

            String type;

            if(p instanceof Cat){
                type = "Cat";
                catNames.add(p.getName());
            } else if (p instanceof Dog) {
                type = "Dog";
                dogNames.add(p.getName());
            }else{
                type = "Unknown";
            }

        }

        scan.close();
    }
}

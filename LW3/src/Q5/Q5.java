package Q5;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        System.out.println("---------------MyJava Lo-Fat Burgers-------------\n\n");

        Scanner sc = new Scanner(System.in);



        String[] entree = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        Double[] entreePrice = { 3.49, 4.59,3.99,2.99};

        String[] sideDish = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        Double[] priceSideDish = { 0.79, 0.69, 1.09, 0.59};

        String[] drink = { "Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        Double[] priceDrink = {1.99,1.90,2.49,0.99};

        System.out.println("------ ENTREE MENU ------");
        for (int i = 0; i < entree.length; i++) {
            System.out.println((i + 1) + ". " + entree[i] + " - $" + entreePrice[i]);
        }

        System.out.print("Choose an entree (1-4) if not needed enter 0 : ");
        int entreeChoice = sc.nextInt();
        int entreeQuantity = 0;
        if(entreeChoice != 0){
            System.out.print("Choose no of units: ");
            entreeQuantity = sc.nextInt();
        }

        System.out.println("\n------ SIDE DISH MENU ------");
        for (int i = 0; i < sideDish.length; i++) {
            System.out.println((i + 1) + ". " + sideDish[i] + " - $" + priceSideDish[i]);
        }

        System.out.print("Choose a side dish (1-4) if not needed enter 0 : ");
        int sideChoice = sc.nextInt();
        int sideQuantity = 0;
        if (sideChoice != 0){
            System.out.print("CChoose no of units: ");
            sideQuantity = sc.nextInt();
        }


        System.out.println("\n------ DRINK MENU ------");
        for (int i = 0; i < drink.length; i++) {
            System.out.println((i + 1) + ". " + drink[i] + " - $" + priceDrink[i]);
        }

        System.out.print("Choose a drink (1-4) if not needed enter 0 : ");
        int drinkChoice = sc.nextInt();
        int drinkQuantity = 0;
        if ( drinkChoice != 0){
            System.out.print("Choose a side dish (1-4): ");
            drinkQuantity = sc.nextInt();
        }

        if (entreeChoice != 0){
            entreeChoice = entreeChoice - 1;
        }
        if (sideChoice != 0){
            sideChoice = sideChoice-1;
        }
        if (drinkChoice != 0){
            drinkChoice = drinkChoice-1;
        }

        Double totalBill =  (entreePrice[entreeChoice] * entreeQuantity )+ (priceSideDish[sideChoice] * sideQuantity) + (priceDrink[drinkChoice ] * drinkQuantity );
        System.out.println(" \nTotal bill amount is : $"+totalBill );

    }
}

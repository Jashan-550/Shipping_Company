package main;

//Jashanpreet Singh Roop Rai
//37333257

import java.util.Scanner;
import tanks.GasItem;
import distance.Calculation;
import distance.Distance;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.printInfo();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter material name (e.g., Oxygen, Hydrogen):");
        String material = sc.nextLine();

        System.out.println("Enter amount in gallons:");
        double gallons = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Final city (e.g., Berlin, Paris):");
        String city = sc.nextLine();

        double density = 8.0;
        double risk = 5.0;

        if (material.equalsIgnoreCase("Oxygen")) {
            density = 9.5; risk = 17.0;
        } else if (material.equalsIgnoreCase("Hydrogen")) {
            density = 0.59; risk = 18.0;
        } else if (material.equalsIgnoreCase("Water")) {
            density = 8.34; risk = 0.0;
        } else if (material.equalsIgnoreCase("Milk")) {
            density = 8.6; risk = 0.0;
        } else if (material.equalsIgnoreCase("Methane")) {
            density = 3.5; risk = 18.0;
        } else if (material.equalsIgnoreCase("Propene")) {
            density = 4.3; risk = 20.0;
        } else {
            System.out.println("Material not found.");
        }

       double distance = Distance.getDistance(city);

        GasItem item = new GasItem(material, gallons, density, risk);
        Calculation calc = new Calculation(distance);
        calc.addItem(item);

        System.out.println("\n ITEM DETAILS ");
        calc.printItem();

        System.out.println("\n SHIPPING SUMMARY ");
        calc.printOrder();

        sc.close();
    }
}

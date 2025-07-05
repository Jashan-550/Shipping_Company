package main;

import java.util.Scanner;
import tanks.Item;
import tanker.Truck;
import distance.Calculation;
import info.Info;

// Name: Aman Singh
// Matriculation No: 12345678
// Group: G1
// Date: 13 June 2025

public class MainApp {
    public static void main(String[] args) {
        Info.printInfo();

        double distanceToBerlin = 289;
        Calculation calc = new Calculation(distanceToBerlin);

        Item oxygen = new Item("Oxygen O2", 17, 1.14);
        calc.addItem(oxygen);

        Truck mediumTruck = new Truck(380, 40);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gallons of Oxygen to ship: ");
        double gallons = sc.nextDouble();

        double vol = calc.totalVolume(gallons);
        double weight = calc.totalWeight(gallons, oxygen.getDensity());
        double price = calc.shippingPrice(gallons, oxygen.getRiskFactor());

        System.out.println("\n--- Shipping Summary ---");
        oxygen.printItemInfo();
        mediumTruck.printTruckInfo();
        System.out.println("Total Volume: " + vol + " liters");
        System.out.println("Total Weight: " + weight + " kg");
        System.out.println("Total Price: €" + price);
    }
}
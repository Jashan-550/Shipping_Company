package distance;

import java.util.ArrayList;
import tanks.Item;
import tanker.Truck;

// Name: Aman Singh
// Matriculation No: 12345678
// Group: G1
// Date: 13 June 2025

public class Calculation {
    private ArrayList<Item> items = new ArrayList<>();
    private double distance;

    public Calculation(double distance) {
        this.distance = distance;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double totalVolume(double gallons) {
        return gallons * 3.78541;
    }

    public double totalWeight(double gallons, double density) {
        return gallons * density;
    }

    public double shippingPrice(double gallons, double riskFactor) {
        double transportCost = 0.01 * gallons * distance;
        double returnCost = 0.6 * distance;
        return transportCost * (1 + (riskFactor / 100)) + returnCost;
    }

    public void printItems() {
        for(Item i : items) {
            i.printItemInfo();
        }
    }
}
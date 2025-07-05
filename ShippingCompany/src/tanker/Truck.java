package tanker;

// Name: Aman Singh
// Matriculation No: 12345678
// Group: G1
// Date: 13 June 2025

public class Truck {
    private double length;
    private double radius;

    public Truck(double length, double radius) {
        this.length = length;
        this.radius = radius;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * length * 0.0163871;
    }

    public void printTruckInfo() {
        System.out.println("Truck Volume: " + calculateVolume() + " liters");
    }

    public double getVolume() {
        return calculateVolume();
    }
}
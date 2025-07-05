package tanks;

// Name: Aman Singh
// Matriculation No: 12345678
// Group: G1
// Date: 13 June 2025

public class Item {
    private String name;
    private double riskFactor;
    private double density;

    public Item(String name, double riskFactor, double density) {
        this.name = name;
        this.riskFactor = riskFactor;
        this.density = density;
    }

    public double calculateVolume(double gallons) {
        return gallons * 3.78541;
    }

    public void printItemInfo() {
        System.out.println("Item: " + name);
        System.out.println("Risk Factor: " + riskFactor + "%");
        System.out.println("Density: " + density + " kg/gallon");
    }

    public double getRiskFactor() { return riskFactor; }
    public double getDensity() { return density; }
}
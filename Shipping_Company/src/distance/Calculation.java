package distance;

//Jashanpreet Singh Roop Rai
//37333257

import java.util.ArrayList;
import tanks.Item;
import tanks.Truck;

public class Calculation {
	
	private ArrayList<Item> items = new ArrayList<>();
	private double distance;
	
	public Calculation(double distance) {
		this.distance = distance;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public double totalVolume() {
		double total = 0;
		for (Item i : items) {
			total += i.getGallons();
		}
		return total;
	}
	
	public double totalWeight() {
		double total = 0;
		for (Item i : items) {
			total += i.getWeight();
			}
		return total;
	}
	
	public double shippingPrice() {
		double base = totalVolume() * 0.01 * distance;
		double riskCost = 0;
		for (Item i : items) {
			riskCost += i.getGallons() * (i.getRiskFactor()/100.0) * 0.01 * distance;
		}
		double returnCost = 0.6 * distance;
		return base + riskCost + returnCost;
	}
	
		public void printItem() {
			for(Item i : items) {
				i.printItemInfo();
			}
		}
		
		public void printOrder() {
			System.out.println("Total Volume : " + totalVolume() + "gallons");
			System.out.println("Total Weight : " + totalWeight() + "lbs");
			System.out.println("Shipping Price : €" + shippingPrice());
			bestShipping();
		}
		
		public void bestShipping() {
			System.out.println("\n Best Truck Combination : ");
			double volume = totalVolume();
			
			Truck large = new Truck("Large");
			Truck medium = new Truck("Medium");
			Truck small = new Truck("Small");
			
			int l = (int)(volume / large.getCapacity());
			volume %= large.getCapacity();
			
			int m = (int)(volume / medium.getCapacity());
			volume %= medium.getCapacity();
			
			int s = (int)Math.ceil(volume / small.getCapacity());
			
			if (l > 0) System.out.println(l + " x Large Truck(s)");
			if (m > 0) System.out.println(m + " x Medium Truck(s)");
			if (s > 0) System.out.println(s + " x Small Truck(s)");
		}
		
	}
	


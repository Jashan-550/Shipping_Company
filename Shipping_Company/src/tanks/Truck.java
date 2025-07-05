package tanks;

//Jashanpreet Singh Roop Rai
//37333257

public class Truck {
	private String type;
	private double capacity;
	
	public Truck(String type) {
	this.type = type;
	
	if(type.equalsIgnoreCase("Small")) {
		this.capacity = 235.61;
	} else if (type.equalsIgnoreCase("Medium")) {
		this.capacity = 826.76;
	} else if (type.equalsIgnoreCase("Large")) {
		this.capacity = 3142.70;
	} else {
		this.capacity = 0;
	}
	
	}
	
	public String getType() {
		return type;
	}
	public double getCapacity() {
		return capacity;
	}
	public void printTruckInfo() {
	System.out.println(type + "Truck - Capacity : "  +capacity + "gallons");
	}

}

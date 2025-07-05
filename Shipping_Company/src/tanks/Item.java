package tanks;

//Jashanpreet Singh Roop Rai
//37333257

public abstract class Item {
	private String name;
	private double gallons;
	private double density;
	private double riskFactor;
	
	
	public Item(String name, double gallons, double density, double riskFactor) 
	{
		this.name = name;
		this.gallons = gallons;
		this.density = density;
		this.riskFactor = riskFactor;
		
	}
	
	public double getGallons() { return gallons;}
	public double getDensity() { return density;}
	public double getRiskFactor() { return riskFactor;}
	public String getName() { return name; }
	
	public double getVolumeInCubicMeters() {
		return gallons * 0.00378541;
		
	}
	
	public double getWeight()
	{
		return gallons * density;
	}
	
	public void printItemInfo()
	{
		System.out.println("Material : " + name);
		System.out.println("Gallons : " + gallons);
		System.out.println("Cubic Meters : " + getVolumeInCubicMeters());
		System.out.println("Weight (lbs) : "+ getWeight());
		System.out.println("Risk Factor : " + riskFactor + "%");
	}
	
}


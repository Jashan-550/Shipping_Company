package distance;

//Jashanpreet Singh Roop Rai
//37333257

public class Distance {
	
	public static double getDistance(String city) {
		city = city.toLowerCase();
		switch (city) {
		case"berlin": return 289.0;
		case"munchin": return 775.0;
		case"leipzig": return 380.0;
		case"dresden": return 477.0;
		case"köln": return 423.0;
		case"rome": return 1611.0;
		case"paris": return 904.0;
		case"wien": return 962.0;
		case"madrid": return 2226.0;
		default:
			System.out.println("City not found so using default 500 Km.");
		    return 500;
		}
		
		
	}

}

package stringmanipulation;

public class manipulation {
	public static void main(String[] args) { 
	 String rain = "yesterday it was raining";
	 String sun = "TODAY IT IS SUNNY";
	 System.out.println(rain.toUpperCase() + ", " + sun.toLowerCase());
	 System.out.println(sun.toLowerCase().substring(0,12) + rain.substring(17,24));
	 System.out.println(sun.length());
	 System.out.println(rain.compareToIgnoreCase(sun));
	}
}

//	private String sun;
//	private String rain;
//	
//
//	public String getSun() {
//		return sun;
//	}
//	public void setSun(String sun) {
//		this.sun = sun;
//	}
//
//	public String getRain() {
//		return rain;
//	}
//	public void setRain(String rain) {
//		this.rain = rain;
//	}
//	
//	public manipulation() {
//	}
//	public manipulation(String sun, String rain) {
//			this.sun = sun;
//			this.rain = rain;
//	}
//	
	
	
//}

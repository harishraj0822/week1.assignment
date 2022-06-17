package week1.day2;

public class car {
	
	public static void main(String[] args) {
	
		car obj = new car();
		obj.printCarName();
		String vechicleColor = obj.getVechicleColor();
	    System.out.println(vechicleColor);
	    boolean carPunctured = obj.isCarPunctured();
	    System.out.println(carPunctured);
	    
	}
	
	

	public void printCarName() {
		System.out.println("Swift");
	}
	
String getVechicleColor() {
	String color = "Red";
			return (color);
	
}

public boolean isCarPunctured() {
	return(false);
}


}

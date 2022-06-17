package assignmentWeek1;

public class TwoWheeler {

  int noOfWheels = 2;
  short noOfMirrors = 2;
  long chasisNumber = 322731l;
  boolean isPunctured = false;
  String bikeName = "MT 15";
  double runningKm = 8000.0822;
  
  
  public static void main(String[] args) {

	  TwoWheeler obj = new TwoWheeler();
	  System.out.println("No. of wheels ="+obj.noOfWheels);
	  System.out.println("No. of mirrors ="+obj.noOfMirrors);
	  System.out.println("Chasis Number ="+obj.chasisNumber);
	  System.out.println("Punctured ="+obj.isPunctured);
	  System.out.println("Bike Name ="+obj.bikeName);
	  System.out.println("Total No. of KMs ="+obj.runningKm);
	  
  }	
}

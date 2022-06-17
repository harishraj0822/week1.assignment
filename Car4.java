package assignmentWeek1;

public class Car4 {
	
	public static void main(String[] args) {
		//method 1
		
		Car4 obj = new Car4();
		boolean applyBreak = obj.applyBreak();
		System.out.println(applyBreak);
		int gear = obj.applyGear();
		System.out.println(gear);
		String ac = obj.applyOnAc();
		System.out.println(ac);
		String accelerator = obj.applyAccelerator();
		System.out.println(accelerator);
		
		//method 2
		
		System.out.println(applyBreak);
		System.out.println(gear);
		System.out.println(ac);
		System.out.println(accelerator);
		
	}

  public boolean applyBreak() {
	  return (false);
  }
  public int applyGear() {
	  int gear = 1;
	  return (gear);
  }
  String applyOnAc() {
	  String ac = "ON";
	  return (ac);  
  }
  String applyAccelerator() {
	  String Accelerator = "Yes";
	  return (Accelerator);
  }
  
}

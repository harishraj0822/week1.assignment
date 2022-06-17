package assignmentWeek1;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		EmployeeDetails obj = new EmployeeDetails();
		String name = obj.empName();
		System.out.println(name);
		
		int empId = obj.empId();
		System.out.println(empId);
		
		String address = obj.empAddress();
		System.out.println(address);
		
		double salary = obj.empSalary();
		System.out.println(salary);
		
		long mobileNumber = obj.empMobileNumber();
		System.out.println(mobileNumber);
		
	}
	
  String empName() {
	  String name = "Harish";
	  return (name);
  }
	int empId() {
		int id = 8;
		return (id);
	}
 String empAddress() {
	 String address = "Perambur, Chennai";
	 return(address);
 }
 double empSalary() {
	 double salary = 50000;
	 return(salary);
 }
 long empMobileNumber() {
	 long mobileNumber = 9840312361l;
	 return (mobileNumber);
 }
}

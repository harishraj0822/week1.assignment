package assignmentWeek1;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int l = arr.length;
		 int count;
		 
		 for (int i = 0; i <l-1; i++) {
			  
			 count = 0;
			 for (int j = i+1; j <l; j++) {
				 
				 if (arr[i]==arr[j]) {
					
					 count = count+1;
				 }
				 if (count>0) {
					 
					 System.out.println(arr[i]);
				 }
				 }
		 }
	}

}
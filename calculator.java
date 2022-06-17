package week1.day2;

public class calculator {
	public static void main(String[] args) {
	calculator obj = new calculator();
	int sum = obj.addTwoNumbers(4, 3);
	System.out.println(sum);
	float sub = obj.subTwoNumbers(150f, 100f);
	System.out.println(sub);
	double mul = obj.multiplyTwoNumber(6000.4000, 3000.2000);
	System.out.println(mul);
	int div = obj.divTwoNumbers(25, 5);
	System.out.println(div);
	}

int a = 4;
int b = 3;

public int addTwoNumbers (int a, int b) {
	return (a+b);
	
}

float c = 150f;
float d = 100f;

public float subTwoNumbers (float c, float d) {
	return (c-d);
 }

double e = 6000.4000;
double f = 3000.2000;

public double multiplyTwoNumber (double e, double f) {
	return (e*f);
	
}
int g = 25;
int h = 5;

public int divTwoNumbers (int g, int h) {
	return (g/h);
	
}
}


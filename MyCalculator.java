package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	
	Calculator cal=new Calculator();
	System.out.println( cal.add(10, 2, 4));
	System.out.println(cal.sub(18, 4));
	System.out.println(cal.mul(56.43, 21.11));
	System.out.println(cal.div(12.0f, 6.0f));
	
	
}
}

package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			System.out.println("it is prime number");
		} else {
			System.out.println("not a prime number");
		}
	}
}

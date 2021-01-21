package loops;

public class MyNumber_runner {
	public static void main(String[] args) {
		MyNumber number = new MyNumber(7);

		boolean isPrime = number.isPrime();

		System.out.println("is_prime  " + isPrime);

		number.printNumberOftriangle();

	}
}

package loops;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;

	}

	public boolean isPrime() {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void printNumberOftriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

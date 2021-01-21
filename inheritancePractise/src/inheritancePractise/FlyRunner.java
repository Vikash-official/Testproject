package inheritancePractise;

interface Flyable {
	void fly();

}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("wings");

	}

	class aero implements Flyable {

		@Override
		public void fly() {
			System.out.println("fuel");

		}

	}
public class FlyRunner {

	public void main(String[] args) {
		Flyable[] fly1 = { new Bird(), new aero() };
		for (Flyable obj : fly1) {
			obj.fly();
		}

	}

}

}

package tr.org.linux.kamp.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println(i + "fizz");
			}

			else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println(i + "buzz");
			}

			else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "fizzbuzz");
			}

		}

	}
}
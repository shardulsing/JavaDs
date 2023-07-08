package looping;

public class PrimeNo {

	public String isprime(int num) {
		int i = 2;
		for (; i < num; i++) {
			if (num % i == 0)
				break;
		}
		if (i == num) {
			return "PrimeNo";
		} else {
			return "CompositeNo";
		}
	}
}

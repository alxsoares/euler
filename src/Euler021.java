public class Euler021 {

	public static void main(String[] args) {

		int sum = 0;

		for (int n = 1; n <= 10000; n++) {
			int a = n;
			int b = amicable(a);

			if (a == amicable(b) && b == amicable(a) && a != b) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

	private static int amicable(int z) {
		int sum_z = 0;
		for (int i = 1; i < z; i++) {
			if (z % i == 0) {
				sum_z += i;
			}
		}
		return sum_z;
	}

}
public class Euler012 {
	static int oldNOD = 0;

	public static void main(String[] args) {
		long triangle = 0;
		for (long i = 100000000; i > 0; i++) {
			triangle += i;
			if (GetFactors(triangle) > 500) {
				System.out.println(triangle);
				break;
			}
		}
	}

	private static int numOfDivisors(long i) {
		int numOfDivisors = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0)
				numOfDivisors++;
		}

		if (numOfDivisors > oldNOD) {
			oldNOD = numOfDivisors;
			System.out.println(oldNOD);
		}
		return numOfDivisors;
	}

	public static long GetFactors(long nInput) {

		long nNumberToFactor = nInput;
		long nCurrentUpper = nInput;
		int i;

		long factors = 1;

		for (i = 2; i < nCurrentUpper; i++) {
			if ((nNumberToFactor % i) == 0) {
				// if we found a factor, the upper number is the new upper limit
				nCurrentUpper = nNumberToFactor / i;
				factors++;

				if (nCurrentUpper != i) // avoid "double counting" the square
										// root
					factors++;
			}
		}
		return factors;
	}
}

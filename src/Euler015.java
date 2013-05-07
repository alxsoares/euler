import java.math.BigInteger;


public class Euler015 {
	public static void main(String[] args) {
		int n = 20;
		BigInteger factN = factorial(n);
		BigInteger factTN = factorial(2*n);
		System.out.println(factN);
		System.out.println(factTN);
		BigInteger solution = factTN.divide(factN);
		
		System.out.println(solution);
	}
	
	 public static BigInteger factorial(int n)
	    {
	        if (n == 0) return new BigInteger("1");
	        BigInteger val = factorial(n-1).multiply(new BigInteger(String.valueOf(n)));
	        return val;
	    }
}

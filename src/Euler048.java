import java.math.BigInteger;


public class Euler048 {

	public static void main(String[] args) {

		BigInteger sum = new BigInteger("0");
		
		for (int i = 1; i <= 1000; i++){
			BigInteger step = new BigInteger(String.valueOf(i)).pow(i);
			sum = sum.add(step);
		}
		
		System.out.println(sum.toString().substring(sum.toString().length()-10));

	}

}

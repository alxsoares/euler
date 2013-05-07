import java.math.BigInteger;


public class Euler020 {
	public static void main(String[] args) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= 100; i++){
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
		}
		String s = factorial.toString();
		System.out.println(s);
		int sum = 0;
		char[] chars = s.toCharArray();
		for(char c : chars){
			sum += Integer.decode(String.valueOf(c));
		}
		System.out.println(sum);
	}
}

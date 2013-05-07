import java.math.BigInteger;

public class Euler025 {

	public static BigInteger b1 = new BigInteger("1");
	public static BigInteger b2 = new BigInteger("1");
	public static BigInteger b3 = new BigInteger("0");

	public static void main(String[] args) {

		for(int i = 2; i < 10000; i++){
			b3 = b2;
			b2 = b2.add(b1);
			b1 = b3;
			
			if (b1.toString().length() == 1000){
				System.out.println(i);
				i = 10001;
			}
		}
		
	}
}

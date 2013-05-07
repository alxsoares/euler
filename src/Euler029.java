import java.math.BigInteger;
import java.util.ArrayList;


public class Euler029 {

	public static void main(String[] args) {
		ArrayList<BigInteger> terms = new ArrayList<BigInteger>();
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				BigInteger base = new BigInteger(String.valueOf(a));
				BigInteger result = base.pow(b);
				boolean contained = false;
				for (BigInteger elem : terms){
					if(elem.equals(result)) {
						contained = true;
						break;
					}
				}
				if(!contained) terms.add(result);
			}
		}
		System.out.println(terms.size());
	}

}

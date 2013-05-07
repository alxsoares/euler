
public class Euler012a {
	
	public static void main(String[] args){
		
		int number = 1;
		int i = 2;
		int cnt = 0;
		int Dn1 = 2;
		int Dn = 2;
		int[] primelist = eratos(1000);
		
		while (cnt < 500) {
			if (i % 2 == 0) {
				Dn = PrimeFactorisationNoD(i + 1, primelist);
				cnt = Dn * Dn1;
			} else {
				Dn1 = PrimeFactorisationNoD((i + 1) / 2, primelist);
				cnt = Dn*Dn1;
			}
			i++;
		}
		number = i * (i - 1) / 2;
		System.out.println(number);
	}
	
	private static int PrimeFactorisationNoD(int number, int[] primelist) {
	    int nod = 1;
	    int exponent;
	    int remain = number;
	 
	    for (int i = 0; i < primelist.length; i++) {
	        // In case there is a remainder this is a prime factor as well
	        // The exponent of that factor is 1
	        if (primelist[i] * primelist[i] > number) {
	            return nod * 2;
	        }
	 
	        exponent = 1;
	        while (remain % primelist[i] == 0) {
	            exponent++;
	            remain = remain / primelist[i];
	        }
	        nod *= exponent;
	 
	        //If there is no remainder, return the count
	        if (remain == 1) {
	            return nod;
	        }
	    }
	    return nod;
	}
	
	private static int[] eratos(int n){
		int[] s = new int[n];
		s[0] = 0; s[1] = 0;
		for (int i = 2; i < n; i++){
			s[i] = 1;
		}

		for (int i = 0; i*i<n; i++) {
			if(s[i] == 1){
				for (int k = 2*i; k < n; k += i){
					s[k] = 0;
				}
			}
		}

		return s;
	}
}

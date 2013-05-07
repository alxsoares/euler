
public class Euler004 {
	public static void main(String[] args) {
		int f1, f2;
		int palprod = 0;
		
		for(f1 = 100; f1 < 1000; f1++){
			for(f2 = 100; f2 < 1000; f2++){
				if(isPalindrome(f1*f2)){
					if (f1*f2 > palprod) palprod = f1*f2;
				}
			}
		}
		System.out.println(palprod);
	}
	
	static boolean isPalindrome(int n){
		n = Math.abs(n);
        if (n % 10 == 0) {
            return n == 0;
        } else {
            int k = n;
            int r = 0;
            while (k > 0) {
                r = 10 * r + k % 10;
                k /= 10;
            }
            return n == r;
        }
	}
}

public class Euler036 {

	public static void main(String[] args) {

		long sum = 0;
		
		for (int i = 1; i < 1000000; i++){
			if (isPalindrome(i) && isPalindromeString(Integer.toBinaryString(i).toCharArray())) sum += i;
		}

		System.out.println(sum);
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
	
	static boolean isPalindromeString(char[] s){
		 int i1 = 0;
		    int i2 = s.length - 1;
		    while (i2 > i1) {
		        if (s[i1] != s[i2]) {
		            return false;
		        }
		        ++i1;
		        --i2;
		    }
		    return true;
	}

}

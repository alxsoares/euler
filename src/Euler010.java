
public class Euler010 {
	public static void main(String[] args) {
		
		int[] s = eratos(2000000);
		long sum = 0;
		for(int i = 0; i < s.length; i++){
			if(s[i] == 1){
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println(sum);
		
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


public class Euler009 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 1000; i++){
			for (int j = 1; j < 1000-i; j++){
				int k = 1000-(i+j);
				if (i*i+j*j==k*k) System.out.println(i*j*k);
			}
		}
		
	}
}

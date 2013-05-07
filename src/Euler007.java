
public class Euler007 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 2; i!=1; i++){
			if(isPrime(i)){
				count++;
				System.out.println(count);
				if (count==10001){
					System.out.println(i);
					break;
				}
			}
		}
		
	}
	
	static boolean isPrime(double pf){
		boolean ret = false;
		for (double i = pf-1; i > 0; i--){
			if (i==1) ret = true;
			if (pf%i==0) break;
		}
		return ret;
	}
}

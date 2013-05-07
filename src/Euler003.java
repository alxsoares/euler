
public class Euler003 {
	public static void main(String[] args) {
		double num=600851475143d;
		double border = Math.floor(Math.sqrt(num));
		double bpf = border;
	
		while (bpf > 1){
			if ((num%bpf==0) && (isPrime(bpf))) break;
			System.out.println(isPrime(29));
			bpf--;
		}
		System.out.println(bpf);
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

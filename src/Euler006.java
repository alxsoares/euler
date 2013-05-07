
public class Euler006 {
	public static void main(String[] args) {
		
		long sum = 0;
		long square = 0;
		int count = 100;
		
		for (int i = 1; i <= count; i++){
			sum += (i*i);
			square += i;
		}
		square *= square;
		
		System.out.println(sum);
		System.out.println(square);
		
		System.out.println(square-sum);
		
	}
}

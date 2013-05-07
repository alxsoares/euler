import java.util.HashMap;


public class Euler034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = factorialMap();
		long time = System.currentTimeMillis();
		long sum = 0;
		for (int i = 10; i < 10000000; i++){
			long sumOfDigits = 0;
			for(char c : String.valueOf(i).toCharArray()){
				sumOfDigits += map.get(Integer.parseInt(String.valueOf(c)));
			}
			if (sumOfDigits == i) sum += i;
		}
		System.out.println(sum);
		time = System.currentTimeMillis() -time;
		System.out.println("Took "+ time + " ms");
	}
	
	public static HashMap<Integer, Integer> factorialMap(){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i = 0; i < 10; i++){
			map.put(Integer.valueOf(i), Integer.valueOf(factorial(i)));
		}
		return map;
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		int val = factorial(n-1) * n;
		return val;
	}


}

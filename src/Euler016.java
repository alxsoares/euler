
public class Euler016 {
	public static void main(String[] args) {
		int sumOfDigits = 0;
		double haha = Math.pow(2, 1000);
		while (haha>10){
			sumOfDigits += haha%10;
			haha = Math.floor(haha/10);
		}
		System.out.println(haha);
		System.out.println(sumOfDigits);
	}
}

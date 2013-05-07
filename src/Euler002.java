
public class Euler002 {
	public static void main(String[] args) {
		int curr=2, prev=1, sum=0;
		while (curr < 4000000){
			if (curr%2==0) sum += curr;
			int t = curr;
			curr += prev;
			prev = t;
		}
		System.out.println(sum);
	}
}

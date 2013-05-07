
public class Euler005 {
	public static void main(String[] args) {
		
		int sm = 1;
		while (sm > 0){
			sm++;
			boolean noR = true;
			for (int j = 1; j <= 20; j++){
				if(sm%j!=0){
					noR = false;
					break;
				}
			}
			if(noR) break;
		}
		
		System.out.println(sm);
		
	}
}

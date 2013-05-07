
public class Euler028 {

	public static void main(String[] args) {
		int sum = 1;
		int ur = 1;
		int ul = 1;
		int ol = 1;
		int or = 1;
		
		for (int i = 1; i <= 500; i++){
			ur += (2+(i-1)*8);
			ul += (4+(i-1)*8);
			ol += (6+(i-1)*8);
			or += (8+(i-1)*8);
			sum += ur+ul+or+ol;
		}
		System.out.println(ur+":"+ul+":"+ol+":"+or);
		System.out.println(sum);

	}

}

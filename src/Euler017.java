
public class Euler017 {

	public static void main (String[] args){
		// Count letters of number from 1 to 1000
		int letters = 0;
		
		// 1 - 100
		int one2onehundred = "onetwothreefourfivesixseveneightnineten".length();
		one2onehundred += "eleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length();
		one2onehundred += 10 * "twentythirtyfortyfiftysixtyseventyeightyninety".length();
		one2onehundred += 8 * "onetwothreefourfivesixseveneightnine".length();
		letters += one2onehundred;
		
		// 100
		letters += 9 * one2onehundred;
		letters += 891 * "and".length();
		letters += 100 * "onehundredtwohundredthreehundredfourhundredfivehundredsixhundredsevenhundredeighthundredninehundred".length();
		// 1000
		letters += "onethousand".length();
		
		System.out.println(letters);
	}
}

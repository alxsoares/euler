import java.util.ArrayList;


public class Euler018 {
	
	public static void main(String[] args) {
		ArrayList<int[]> data = new ArrayList<int[]>();
		
		data.add(new int[] {75});
		data.add(new int[] {95,64});
		data.add(new int[] {17,47,82});
		data.add(new int[] {18,35,87,10});
		data.add(new int[] {20, 4,82,47,65});
		data.add(new int[] {19, 1,23,75, 3,34});
		data.add(new int[] {88, 2,77,73, 7,63,67});
		data.add(new int[] {99,65, 4,28, 6,16,70,92});
		data.add(new int[] {41,41,26,56,83,40,80,70,33});
		data.add(new int[] {41,48,72,33,47,32,37,16,94,29});
		data.add(new int[] {53,71,44,65,25,43,91,52,97,51,14});
		data.add(new int[] {70,11,33,28,77,73,17,78,39,68,17,57});
		data.add(new int[] {91,71,52,38,17,14,91,43,58,50,27,29,48});
		data.add(new int[] {63,66, 4,68,89,53,67,30,73,16,69,87,40,31});
		data.add(new int[] { 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23});

		for (int i = data.size(); i > 1; i--){
			int[] dataRow = data.get(i-1);
			int[] addRow = data.get(i-2);
			for (int j = 0; j < dataRow.length-1; j++){
				int biggerNum = 0;
				if(dataRow[j] > dataRow[j+1]){biggerNum=dataRow[j];} else {biggerNum=dataRow[j+1];};
				addRow[j] = addRow[j]+biggerNum;
			}
			data.set(i-2, addRow);
		}
		
		System.out.println(data.get(0)[0]);
	}
}

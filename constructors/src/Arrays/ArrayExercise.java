package Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		int[][] arraySize10 = new int[1][10];
		arraySize10[0][0] = 11;
		arraySize10[0][1] = 12; 
		arraySize10[0][2] = 13;
		arraySize10[0][3] = 14;
		arraySize10[0][4] = 15;
		arraySize10[0][5] = 16;
		arraySize10[0][6] = 17;
		arraySize10[0][7] = 18;
		arraySize10[0][8] = 19;
		arraySize10[0][9] = 20;
		for (int[] x : arraySize10) {
			for (int y : x) {
				System.out.println(y * 10);
			}
			System.out.println();
		} 
		System.out.println("============================");
		
	int[][] ArraySize10 = { { 0 }, { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 }, { 7 }, { 8 }, { 9 } };
	{
		for (int b = 0; b < ArraySize10.length; b++) {
			for (int c = 0; c < ArraySize10[c].length; c++) {
				System.out.print(ArraySize10[b][c]);
				// System.out.println();
				// System.out.print(ArraySize10[i][j*10]);
			}
			System.out.println();
		}
	}

}
}
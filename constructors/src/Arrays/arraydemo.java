package Arrays;

public class arraydemo {
	public static void main(String[] args) {		
		//SINGLE DIMENTIONAL ARRAYS
		//first method, empty (single dimension)
		int[] ageArray;
				
		//second method, creates array with values
		int[] array = {24,35,65,375,245,5};
		String[] stringArray = {"but", "why",",",  "why", "would", "you", "do", "this"};
		//printing array
		for(String s : stringArray) {
			System.out.print(s + " ");
			//System.out.println(s);			
		}
		
		
		
		//third method, creates array of specific size
		int[] arraySize = new int[5];
		//adding values to array
		arraySize[0] = 20;
		
		//MULTI DIMENTIONAL ARRAYS
		// first method
		int[][] multiArray; 
		
		//second method
		int[][] arrayMulti = {
				{54,636,7543}, 
				{454,653}, 
				{4252,653,245},
				{7}
				};
		
		//third method	
		// first [] is number of arrays (this scenario = 3)
		// second [] is number of values
		int[][] mArraySize = new int[3][65]; 
		///adding values - can't use 3 cause 0 = 1, 1 = 2, 2 = 3
		mArraySize[2][4] = 7576;
		
		
		
		int[][] loopArray = { {54357,63943,78}, {521314,68435}, {252,6,2184355}, {7} };
		
		//nested for loop
		for(int i = 0; i < loopArray.length; i++) {
			for(int j = 0; j < loopArray[i].length; j++) {
				System.out.println(loopArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		//nested foreach loop
		for(int[] a : loopArray) {
			for(int b : a) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		
		//nested for and foreach loop together
		for(int l : array) {
			for(int m = 0; m < array.length; m++) {
				if(array[m] == l) {
					System.out.println(l);
				}
			}
				System.out.println("aaaaaaaaaaaaaaaaaaand now");
			}
	}
}

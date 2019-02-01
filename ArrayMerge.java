import java.util.Arrays;

public class ArrayMerge{


	public static int[] mergeArray(int[] first, int[] second){
		
		//YOUR CODE GOES HERE

		int [] newArray = new int[first.length + second.length];
		int newArraySize = 0;

		for(int i = 0; i < first.length; i++){
			newArray[newArraySize++] = first[i];
		}

		for(int i = 0; i < second.length; i++){
			newArray[newArraySize++] = second[i];
		}

		return newArray;
	}

	public static void printArray(int[] array){
		
		//YOUR CODE GOES HERE

	/*	System.out.println(Arrays.toString (array));
		Method prefered by me, but apparently not acceptable...

		So here is a far more inelegant solution (that took a lot longer to figure out)
	*/  	
		System.out.println();
		System.out.print("[");

		for(int i = 0; i < (array.length - 1); i++){
			System.out.print(array[i]);
			System.out.print(", ");

		}
		
		if((array.length - 1) < 0){
			System.out.println("]");			
		}
		
		else{
			System.out.println(array[array.length - 1] + "]");

		}
	}

	public static void main(String[] args){

		int[] firstArray;
		firstArray = new int[]{1,2,3};
		int[] secondArray;
		secondArray = new int[]{4,5,6,7};
		
		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{1};
		secondArray = new int[]{};

		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));

		firstArray = new int[]{};
		secondArray = new int[]{4};

		printArray(firstArray);
		printArray(secondArray);
		printArray(mergeArray(firstArray,secondArray));
	}

}

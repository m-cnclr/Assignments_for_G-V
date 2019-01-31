import java.util.Arrays;

public class ArrayMerge{


	public static int[] mergeArray(int[] first, int[] second){
		
		//YOUR CODE GOES HERE

		int [] newArray = new int[first.length + second.length];
		int newArraySize = 0;

		for(int i = 0; i < first.length; i++){
			newArray[i] = first[i];
			newArraySize++;
		}

		for(int j = 0; j < second.length; j++){
			newArray[newArraySize++] = second[j];
		}

		return newArray;
	}

	public static void printArray(int[] array){
		
		//YOUR CODE GOES HERE

		System.out.println(Arrays.toString (array));
		
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

public class ArraySum{

	public static int sum(int[] array){
		
		//YOUR CODE GOES HERE
		
		int summation = 0;
		for (int i = 0; i < array.length; i++){
			summation = summation + array[i];
	
		}

		return summation;

	}

	public static void main(String[] args){

		int[] firstArray;
		firstArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum of firstArray: " + sum(firstArray));

		int[] secondArray;
		secondArray = new int[]{};
		System.out.println("Sum of secondArray: " + sum(secondArray));

		int[] thirdArray;
		thirdArray = new int[]{10};
		System.out.println("Sum of thirdArray: " + sum(thirdArray));
	}
}

//import java.util.Arrays;

public class SelectionSort { 
 
	public static void sort(int[] xs){
 
		//YOUR CODE GOES HERE

		for (int i = 0; i < xs.length; i++){
			int min = i;
			for (int j = i+1; j < xs.length; j++){
				if(xs[j] < xs[min]){
					min = j;
				}	
			}
			if(i != min){
				int temp = xs[min];
				xs[min] = xs[i];
				xs[i] = temp;
			}
			//System.out.println(Arrays.toString(xs));
		}

	}


	public static void printArray(int[] array){
		
		//YOUR CODE GOES HERE

		//System.out.println(Arrays.toString(array));
		
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

	public static void main(String[] args) { 
 
		int[] array; 
		array = new int[]{100,34,72,56,82,67,94}; 
 	
 		printArray(array);
		sort(array); 
 		printArray(array);
 
		array = new int[]{1,2,2,1,2,2,1,0}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

		array = new int[]{1}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

		array = new int[]{}; 
 		printArray(array);
		sort(array); 
 		printArray(array);

	} 

}
 
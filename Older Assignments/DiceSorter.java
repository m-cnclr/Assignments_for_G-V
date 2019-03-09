import java.util.Arrays;
import java.util.Scanner;

public class DiceSorter{

	Dice[] arrayOfDice; 
	int numberOfDice;

DiceSorter(int numberOfDice){

	arrayOfDice = new Dice[numberOfDice];
	for(int i = 0; i < numberOfDice; i++){
		arrayOfDice[i] = new Dice();
	}

	this.numberOfDice = numberOfDice;

	}

public void rollAndSort(int timesRolled){

	for(int k = 0; k < timesRolled; k++){

		for(int i = 0; i < numberOfDice; i++){
			arrayOfDice[i].roll();
		}

		System.out.println("Before Sorting:");
		int[] diceValue = new int[numberOfDice];
		for(int i = 0; i < numberOfDice; i++){
			diceValue[i] = arrayOfDice[i].getCurrentValue();
		}	
		
		System.out.print(Arrays.toString(diceValue));
		System.out.println();

		for(int i = 0; i < numberOfDice; i++){
			int min = i;
			for (int j = i+1; j < numberOfDice; j++){
				if(arrayOfDice[j].compareTo(arrayOfDice[min]) < 1){
					min = j;
				}	
			}
			if(i != min){
				Dice temp = arrayOfDice[min];
				arrayOfDice[min] = arrayOfDice[i];
				arrayOfDice[i] = temp;
			}
			
		}

		for(int i = 0; i < numberOfDice; i++){
				diceValue[i] = arrayOfDice[i].getCurrentValue();

		}

			System.out.println("After Sorting:");
			System.out.println(Arrays.toString(diceValue));

	}

//	compareTo(dice);
	

}
	
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	int n, m;

	if(args.length == 0){
		System.out.println("How many dice would you like to roll?");
		n = userInput.nextInt();
		System.out.println("How many times would you like to roll?");
		m = userInput.nextInt();
	}
	else if(args.length == 1){
		n = Integer.parseInt(args[0]);
		System.out.println("How many times would you like to roll?");
		m = userInput.nextInt();
	}

	else{ 
		n = Integer.parseInt(args[0]);
		m = Integer.parseInt(args[1]);
	}

	DiceSorter sorter = new DiceSorter(n);
	sorter.rollAndSort(m);

	}


}




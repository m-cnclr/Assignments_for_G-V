import java.util.Arrays;

public class SetDicePlayer{

	public static void main(String[] args){

		int param = args.length;
		int n, m;

		if (param == 0){
			n = 2;
			m = 500000;
		}
		else if(param == 1){
			n = Integer.parseInt(args[0]);
			m = 500000;
		}
		else{
			n = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
		}

		int diceCount = ((n*5)+1);

		int diceFaceArray[] = new int[diceCount];
		for (int i = 0; i < diceCount; i++){
			diceFaceArray[i] = 0;
		}

		Dice dice;
		dice = new Dice();
		int sum, diceIndex;

		for (int i = 0; i < m; i++){
			sum = 0;
			for(int j = 0; j < n; j++){
				dice.roll();
				sum = sum + dice.getCurrentValue();
			}
			diceIndex = sum - n;
			diceFaceArray[diceIndex]++;
		}

		DiceSorter diceStorter = new DiceSorter(n);

	//	System.out.println(Arrays.toString(diceFaceArray));
		}	

	}

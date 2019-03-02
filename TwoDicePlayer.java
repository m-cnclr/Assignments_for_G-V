import java.util.Arrays;

public class TwoDicePlayer{

	public static void main(String[] args){

		int param = args.length;
		int n;

		if (param == 1){
			n = Integer.parseInt(args[0]);
		}
		else {
			n = 500000;
		}

		int diceNumber = 2;
		int diceCount = ((diceNumber*6 - diceNumber) + 1);

		int diceFaceArray[] = new int[diceCount];
		for (int i = 0; i < diceCount; i++){
			diceFaceArray[i] = 0;
		}

		Dice dice;
		dice = new Dice();
		int sum, diceRoll1, diceRoll2, diceIndex;

		for (int i = 0; i < n; i++){
			dice.roll();	
			diceRoll1 = dice.getCurrentValue();
			dice.roll();
			diceRoll2 = dice.getCurrentValue();
			sum = diceRoll1 + diceRoll2;
			diceIndex = sum - 2;
			diceFaceArray[diceIndex]++;
		}

		System.out.println(Arrays.toString(diceFaceArray));
	}
}

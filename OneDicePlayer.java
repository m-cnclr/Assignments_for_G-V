import java.util.Arrays;

public class OneDicePlayer{

	public static void main(String[] args){

	int param = args.length;
	int n;

	if (param == 1){
		n = Integer.parseInt(args[0]);
	}
	else {
		n = 500000;
	}

	int diceFaceArray[] = new int[6];
	for (int i = 0; i < 6; i++){
		diceFaceArray[i] = 0;
	}

	Dice dice;
	dice = new Dice();
	int diceRoll;

	for (int i = 0; i < n; i++){

	dice.roll();	
	diceRoll = dice.getCurrentValue();
	if (diceRoll == 1){
		diceFaceArray[0]++;
	}
	else if (diceRoll == 2){
		diceFaceArray[1]++;
	}
	else if (diceRoll == 3){
		diceFaceArray[2]++;
	}
	else if (diceRoll == 4){
		diceFaceArray[3]++;
	}
	else if (diceRoll == 5){
		diceFaceArray[4]++;
	}
	else if (diceRoll == 6){
		diceFaceArray[5]++;
	}
}

	System.out.println(Arrays.toString(diceFaceArray));

}
}
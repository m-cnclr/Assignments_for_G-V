import java.util.Random;

public class Dice {

	int diceRoll;
	Random rand;

	Dice(){

		rand = new Random();
		roll();
	}

	public void roll(){

		diceRoll = rand.nextInt(6)+1;

//		System.out.println(diceRoll);
	}

	public int getCurrentValue(){

		return diceRoll;

	}

	public int compareTo(Dice other){

		if(getCurrentValue() < other.getCurrentValue()){
			return -1;
		}
		if(getCurrentValue() == other.getCurrentValue()){
			return 0;
		}
		else 
			return 1;
	}

	public static void main (String[] args){
	  
		Dice dice;
		dice = new Dice();
		System.out.println("Initial value: " + dice.getCurrentValue());
		for(int i = 0; i <10; i++){
			dice.roll();
			System.out.println("Next value: " + dice.getCurrentValue());
		}
		
	}

}
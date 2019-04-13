import java.util.Arrays;
import java.lang.Math;

//This object is the child of the Sleep Object and calculates the value of sleep   
//cycles to the power of e. It saves four arrays of sleep cycles per phase in the
//parent SleepObject, and uses a qualifier to let me know which of the calcuation
//methods is used to create a specfic Sleep Object.

public class PowerOfE extends SleepObject{

	public PowerOfE(DataToKeep db){
		super(db);
		qualifier = "the power of e";
		eExp();
	}

	private void eExp(){

		double powE, sumPowE; 

		for(int i = 0; i < sleepCycles; i++){
			powE = sumPowE = 0;
			for (int j = 1; j < db.getFQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFQ()[k];
				}

				powE = Math.pow((((double)db.getFQ()[j + i])*100/nightSleepTotal),Math.E); 
	            sumPowE = sumPowE + powE;  
			}

			fq[i] = (5 * (sumPowE/db.getFQ().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			powE = sumPowE = 0;
			for (int j = 1; j < db.getFullMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFullMoon()[k];
				}

				powE = Math.pow((((double)db.getFullMoon()[j + i])*100/nightSleepTotal),Math.E); 
	            sumPowE = sumPowE + powE; 
			}

			fullMoon[i] = (5 * (sumPowE/db.getFullMoon().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			powE = sumPowE = 0;
			for (int j = 1; j < db.getLQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getLQ()[k];
				}

				powE = Math.pow((((double)db.getLQ()[j + i])*100/nightSleepTotal),Math.E); 
	            sumPowE = sumPowE + powE;   
			}

			lq[i] = (5 * (sumPowE/db.getLQ().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			powE = sumPowE = 0;
			for (int j = 1; j < db.getNewMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getNewMoon()[k];
				}

				powE = Math.pow((((double)db.getNewMoon()[j + i])*100/nightSleepTotal),Math.E); 
	            sumPowE = sumPowE + powE;   
			}

			newMoon[i] = (5 * (sumPowE/db.getNewMoon().length));	
		}

	}	

} 




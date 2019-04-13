import java.util.Arrays;
import java.lang.Math;

//This object is the child of the Sleep Object and calculates the root mean square 
//of the average per sleep cycle.  It saves four arrays of sleep cycles per phase in 
//the parent SleepObject, and uses a qualifier to let me know which of the calcuation
//methods is used to create a specfic Sleep Object.

public class Rms extends SleepObject{

	public Rms(DataToKeep db){
		super(db);
		qualifier = "root mean square";
		rootMeanSquare();
	}

	private void rootMeanSquare(){

		double meanSquare, sumMeanSquare;

		for(int i = 0; i < sleepCycles; i++){
			meanSquare = sumMeanSquare = 0;
			for (int j = 1; j < db.getFQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFQ()[k];
				}

				meanSquare = Math.pow(((((double)db.getFQ()[j + i])/nightSleepTotal)*100),2); 
	            sumMeanSquare = sumMeanSquare + meanSquare;  
			}
			
			fq[i] = Math.sqrt(5 * (sumMeanSquare/db.getFQ().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			meanSquare = sumMeanSquare = 0;
			for (int j = 1; j < db.getFullMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;

				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFullMoon()[k];
				}

				meanSquare = Math.pow(((((double)db.getFullMoon()[j + i])/nightSleepTotal)*100),2); 
	            sumMeanSquare = sumMeanSquare + meanSquare;	   
			}
			
			fullMoon[i] = Math.sqrt(5 * (sumMeanSquare/db.getFullMoon().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			meanSquare = sumMeanSquare = 0;
			for (int j = 1; j < db.getLQ().length; j = (j + 5)){
				int nightSleepTotal = 0;

				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getLQ()[k];
				}

				meanSquare = Math.pow(((((double)db.getLQ()[j + i])/nightSleepTotal)*100),2);
	            sumMeanSquare = sumMeanSquare + meanSquare;  
			}
			
			lq[i] = Math.sqrt(5 * (sumMeanSquare/db.getLQ().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			meanSquare = sumMeanSquare = 0;
			for (int j = 1; j < db.getNewMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;	

				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getNewMoon()[k];
				}

				meanSquare = Math.pow(((((double)db.getNewMoon()[j + i])/nightSleepTotal)*100),2); 
	            sumMeanSquare = sumMeanSquare + meanSquare;	   
			}
			
			newMoon[i] = Math.sqrt(5 * (sumMeanSquare/db.getNewMoon().length));	
		}

	}	

} 




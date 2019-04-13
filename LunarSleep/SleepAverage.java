import java.util.Arrays;

//this object is the child of the Sleep Object and calculates the average values 
//of each sleep cycle.  It saves four arrays of sleep cycles per phase in the
//parent SleepObject, and uses a qualifier to let me know which of the calcuation
//methods is used to create a specfic Sleep Object.

//all Sleep Objects start with "so"

public class SleepAverage extends SleepObject{

	public SleepAverage(DataToKeep db){
		super(db);
		qualifier = "average";
		convertToAverage();
	}

	private void convertToAverage(){

		
		double percentAverage, sumOverallAverage;

		for(int i = 0; i < sleepCycles; i++){
			percentAverage = sumOverallAverage = 0;
			for (int j = 1; j < db.getFQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFQ()[k];
				}

				percentAverage = ((double)db.getFQ()[j + i])/nightSleepTotal; 
	            sumOverallAverage = sumOverallAverage + percentAverage;  
			}
			
			fq[i] = (5 * (sumOverallAverage/db.getFQ().length))*100;	

		}

		for(int i = 0; i < sleepCycles; i++){
			percentAverage = sumOverallAverage = 0;
			for (int j = 1; j < db.getFullMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFullMoon()[k];

				}

				percentAverage = ((double)db.getFullMoon()[j + i])/nightSleepTotal; 
	            sumOverallAverage = sumOverallAverage + percentAverage;	   
			}
			
			fullMoon[i] = (5 * (sumOverallAverage/db.getFullMoon().length))*100;	

		}

		for(int i = 0; i < sleepCycles; i++){
			percentAverage = sumOverallAverage = 0;
			for (int j = 1; j < db.getLQ().length; j = (j + 5)){
				int nightSleepTotal = 0;			

				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getLQ()[k];
				}

				percentAverage = ((double)db.getLQ()[j + i])/nightSleepTotal; 
	            sumOverallAverage = sumOverallAverage + percentAverage;

			}
			
			lq[i] = (5 * (sumOverallAverage/db.getLQ().length))*100;	

		}

		for(int i = 0; i < sleepCycles; i++){
			percentAverage = sumOverallAverage = 0;
			for (int j = 1; j < db.getNewMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;			

				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getNewMoon()[k];
				}

				percentAverage = ((double)db.getNewMoon()[j + i])/nightSleepTotal; 
	            sumOverallAverage = sumOverallAverage + percentAverage;	   
			}
			
			newMoon[i] = (5 * (sumOverallAverage/db.getNewMoon().length))*100;	

		}
	}	
}
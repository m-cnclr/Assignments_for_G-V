import java.util.Arrays;


//This class creates an object that returns four double arrays related to
//the change the average %Deep, %Wake, %Light, %REM

public class SleepAverage extends SleepObject{

	private double[] percentAverages;

	public SleepAverage(DataToKeep db){
		super(db);
		qualifier = "average";
     	percentAverages = new double[sleepCycles];
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
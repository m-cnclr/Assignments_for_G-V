import java.util.Arrays;
import java.lang.Math;

//This object is the child of the Sleep Object and calculates the standard deviation
//This is the measure used to see if the data is has a narrow or wide spread.  It 
// uses the average values calcuated first.  Like the others, 
//It saves four arrays of sleep cycles per phase in the
//parent SleepObject, and uses a qualifier to let me know which of the calculation
//methods is used to create a specfic Sleep Object.

public class StandardDeviation extends SleepObject{

	private double meanSquare, sumMeanSquare;
	private SleepAverage soAve;

	public StandardDeviation(DataToKeep db, SleepAverage soAve){
		super(db);
		this.soAve = soAve;
		qualifier = "standard deviation";
		stanDev();
	}

	private void stanDev(){

		double stanDev, sumStanDev;

		for(int i = 0; i < sleepCycles; i++){
			stanDev = sumStanDev= 0;
			for (int j = 1; j < db.getFQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFQ()[k];
				}

				stanDev = Math.pow((((((double)db.getFQ()[j + i])/ nightSleepTotal)*100) - 
						  soAve.getFQ()[i]),2); 
	            sumStanDev = sumStanDev + stanDev;  
			}
			
			fq[i] = Math.sqrt((sumStanDev/((db.getFQ().length)/5)));	
		}

		for(int i = 0; i < sleepCycles; i++){
			stanDev = sumStanDev= 0;
			for (int j = 1; j < db.getFullMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFullMoon()[k];
				}

				stanDev = Math.pow((((((double)db.getFullMoon()[j + i])/ nightSleepTotal)*100) - 
						  soAve.getFQ()[i]),2); 
	            sumStanDev = sumStanDev + stanDev;  
			}
			
			fullMoon[i] = Math.sqrt((sumStanDev/((db.getFullMoon().length)/5)-1));	
		}

		for(int i = 0; i < sleepCycles; i++){
			stanDev = sumStanDev= 0;
			for (int j = 1; j < db.getLQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getLQ()[k];
				}

				stanDev = Math.pow((((((double)db.getLQ()[j + i])/ nightSleepTotal)*100) - 
						  soAve.getFQ()[i]),2); 
	            sumStanDev = sumStanDev + stanDev;  
			}
			
			lq[i] = Math.sqrt((sumStanDev/((db.getLQ().length)/5)-1));	
		}

		for(int i = 0; i < sleepCycles; i++){
			stanDev = sumStanDev= 0;
			for (int j = 1; j < db.getNewMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getNewMoon()[k];
				}

				stanDev = Math.pow((((((double)db.getNewMoon()[j + i])/ nightSleepTotal)*100) - soAve.getNewMoon()[i]),2); 
	            sumStanDev = sumStanDev + stanDev;  
			}
			
			newMoon[i] = Math.sqrt((sumStanDev/((db.getNewMoon().length)/5)-1));	
		}


	}	

} 




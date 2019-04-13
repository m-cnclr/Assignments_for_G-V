import java.util.Arrays;
import java.lang.Math;

//This object is the child of the Sleep Object and calculates the natural Log of the  
//average per sleep cycle.  It saves four arrays of sleep cycles per phase in the
//parent SleepObject, and uses a qualifier to let me know which of the calcuation
//methods is used to create a specfic Sleep Object.

public class NaturalLog extends SleepObject{

	public NaturalLog(DataToKeep db){
		super(db);
		qualifier = "e";
		ln();
	}

	private void ln(){

		double natLog, sumNatLog; 

		for(int i = 0; i < sleepCycles; i++){
			natLog = sumNatLog = 0;
			for (int j = 1; j < db.getFQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFQ()[k];
				}

				natLog = Math.log((((double)db.getFQ()[j + i])*100/nightSleepTotal)); 
	            sumNatLog = sumNatLog + natLog;  
			}

			fq[i] = (5 * (sumNatLog/db.getFQ().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			natLog = sumNatLog = 0;
			for (int j = 1; j < db.getFullMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getFullMoon()[k];
				}

				natLog = Math.log((((double)db.getFullMoon()[j + i])*100/nightSleepTotal)); 
	            sumNatLog = sumNatLog + natLog;  
			}

			fullMoon[i] = (5 * (sumNatLog/db.getFullMoon().length));	
		}

		for(int i = 0; i < sleepCycles; i++){
			natLog = sumNatLog = 0;
			for (int j = 1; j < db.getLQ().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getLQ()[k];
				}

				natLog = Math.log((((double)db.getLQ()[j + i])*100/nightSleepTotal)); 
	            sumNatLog = sumNatLog + natLog;  
			}

			lq[i] = (5 * (sumNatLog/db.getLQ().length));	

		}

		for(int i = 0; i < sleepCycles; i++){
			natLog = sumNatLog = 0;
			for (int j = 1; j < db.getNewMoon().length; j = (j + 5)){
				int nightSleepTotal = 0;
				
				for(int k = j; k < j + 4; k++){
					nightSleepTotal = nightSleepTotal + db.getNewMoon()[k];
				}

				natLog = Math.log((((double)db.getNewMoon()[j + i])*100/nightSleepTotal)); 
	            sumNatLog = sumNatLog + natLog;  
			}

			newMoon[i] = (5 * (sumNatLog/db.getNewMoon().length));	
		}

	}	

} 




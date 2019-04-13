import java.util.Arrays;
import java.lang.Math;

// The Compare class takes all the Sleep Objects and compares them to see which 
// calculation method provides the larges differences in sleep cycles as the moon
// transitions.

public class Compare{

	private int sleepCycles = 4;
	private SleepDifference whichCalcMethod;
	private double maxDiff;
	private String whichPhaseDiff = "";
	private String temp;


	public void compareTheLot(SleepDifference soAveDiff, SleepDifference soRMSDiff, 
							  SleepDifference soNatLogDiff, SleepDifference soPowEDiff){


		System.out.println("The largest difference bween sleep cycles occur " + 
		         			"between the following phases:");
 
		for (int i = 0; i < sleepCycles; i++){
			if(Math.abs(soAveDiff.getMaxValue()[i]) > (Math.abs(soRMSDiff.getMaxValue()[i]))){
				maxDiff = soAveDiff.getMaxValue()[i];
				whichPhaseDiff = soAveDiff.getInPhase()[i];
				whichCalcMethod = soAveDiff;

			} else {
				maxDiff = soRMSDiff.getMaxValue()[i];
				whichPhaseDiff = soRMSDiff.getInPhase()[i];
				whichCalcMethod = soRMSDiff;
			}

			if(Math.abs(maxDiff) < Math.abs(soNatLogDiff.getMaxValue()[i])){
				maxDiff = soNatLogDiff.getMaxValue()[i];
				whichPhaseDiff = soNatLogDiff.getInPhase()[i];
				whichCalcMethod = soNatLogDiff;
			}

			if(Math.abs(maxDiff) < Math.abs(soPowEDiff.getMaxValue()[i])){
				maxDiff = soPowEDiff.getMaxValue()[i];
				whichPhaseDiff = soPowEDiff.getInPhase()[i];
				whichCalcMethod = soPowEDiff;
			}

			whichCalcMethod.setPrintFlag();
			System.out.println(maxDiff + "," + whichPhaseDiff + whichCalcMethod.getQualifier());

		}

	}
}



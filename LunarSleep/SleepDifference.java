import java.util.Arrays;
import java.lang.Math;

public class SleepDifference{
	
	//will read in the sleep patterns per page from DataToKeep.

	private int sleepCycles = 4;
	private double[] fq2fullMoon, fullMoon2lq, lq2newMoon, newMoon2fq;
	private SleepObject so;
	private double[] maxValue = {0,0,0,0};
	private String[] inPhase = {"","","",""};
	private double maxDiffPhase;

	public SleepDifference(SleepObject so){

		this.so = so;
		fq2fullMoon = new double[sleepCycles];
		fullMoon2lq = new double[sleepCycles];
		lq2newMoon = new double[sleepCycles];
		newMoon2fq = new double[sleepCycles];
		differenceBetwnPhase();
		compareTo();

	} 
	
	public void differenceBetwnPhase(){//this section looks at the % difference between phase

		for(int i = 0; i < sleepCycles; i++){
			fq2fullMoon[i] = (((so.getFullMoon()[i] - so.getFQ()[i])/
							  so.getFQ()[i]) * 100);

		}

		for(int i = 0; i < sleepCycles; i++){
			fullMoon2lq[i] = (((so.getLQ()[i] - so.getFullMoon()[i])/
							  so.getFullMoon()[i]) * 100);

		}

		for(int i = 0; i < sleepCycles; i++){
			lq2newMoon[i] = (((so.getNewMoon()[i] - so.getLQ()[i])/
							  so.getLQ()[i]) * 100);

		}

		for(int i = 0; i < sleepCycles; i++){
			newMoon2fq[i] = (((so.getFQ()[i] - so.getNewMoon()[i])/
							  so.getNewMoon()[i]) * 100);

		}

	}

	public void compareTo(){
	
		for(int i = 0; i < sleepCycles; i++){
			if(Math.abs(fq2fullMoon[i]) > Math.abs(maxValue[i])){
				maxValue[i] = fq2fullMoon[i];
				inPhase[i] = " between the first quarter and the full moon.";
			}
			if(Math.abs(fullMoon2lq[i]) >  Math.abs(maxValue[i])){
				maxValue[i]= fullMoon2lq[i];
				inPhase[i] = " between the full moon and the last quarter.";
			}
			if(Math.abs(lq2newMoon[i]) >  Math.abs(maxValue[i])){
				maxValue[i] = lq2newMoon[i];
				inPhase[i] = " between the last quarter and the new moon.";
			}
			if(Math.abs(newMoon2fq[i]) >  Math.abs(maxValue[i])){
				maxValue[i] = newMoon2fq[i];
				inPhase[i] = " between the new moon and the first quarter.";
			}

		}

		maxDiffPhase = 0;
		for(int i = 0; i < sleepCycles; i++){

			if(Math.abs(maxValue[i]) > maxDiffPhase){
				maxDiffPhase = maxValue[i];
			}

		}

	}

	public void printResults(){

		System.out.println("The differences in sleep patterns between the first quarter" +
							" and full moon are:");
		System.out.println(Arrays.toString(fq2fullMoon));
		System.out.println("The differences in sleep patterns between the full moon" +
							" and last quarter are:");
		System.out.println(Arrays.toString(fullMoon2lq));
		System.out.println("The differences in sleep patterns between the last quarter" +
							" and full moon are:");
		System.out.println(Arrays.toString(lq2newMoon));
		System.out.println("The differences in sleep patterns between the new moon" +
							" and first quarter are:");
		System.out.println(Arrays.toString(newMoon2fq));
		System.out.println();

		for(int i = 0; i < sleepCycles; i++){
			System.out.println(maxValue[i] + inPhase[i]);

		}

	}

	public double[] getFQ2fullMoon(){
		return fq2fullMoon;
	}
	public double[] getFullMoon2lq(){
		return fullMoon2lq;
	}
	public double[] getLQ2NewMoon(){
		return lq2newMoon;
	}
	public double[] getNewMoon2FQ(){
		return newMoon2fq;
	}
	public double[] getMaxValue(){
		return maxValue;
	}
	public String[] getInPhase(){
		return inPhase;
	}
	public double getMaxDiffPhase(){
		return maxDiffPhase;
	}

}
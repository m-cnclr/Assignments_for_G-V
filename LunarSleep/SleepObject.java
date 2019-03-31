import java.util.Arrays;

public class SleepObject{

	protected int sleepCycles = 4;
	protected DataToKeep db;
	protected double[] fq, fullMoon, lq, newMoon;
	protected String qualifier = "average";

	public SleepObject(DataToKeep db){

		this.db = db; 
		fq = new double[sleepCycles];
		fullMoon = new double[sleepCycles];
		lq = new double[sleepCycles];
		newMoon = new double[sleepCycles];

	}

	public void printResults(){

		System.out.println();
		System.out.println("Your " + qualifier + " sleep cycles for the first quarter are:");
		System.out.println(Arrays.toString(fq));
		System.out.println("Your" + qualifier + " sleep cycles for the full moon are:");
		System.out.println(Arrays.toString(fullMoon));
		System.out.println("Your " + qualifier + " sleep cycles for the last quarter are:");
		System.out.println(Arrays.toString(lq));
		System.out.println("Your " + qualifier + " sleep cycles for the new moon are:");
		System.out.println(Arrays.toString(newMoon));
		System.out.println();

	}

	public double[] getFQ(){
		return fq;
	}
	public double[] getFullMoon(){
		return fullMoon;
	}
	public double[] getLQ(){
		return lq;
	}
	public double[] getNewMoon(){
		return newMoon;
	}

}
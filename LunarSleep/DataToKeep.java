import java.util.Arrays;

public class DataToKeep{
	
	//this file will accepts a string of clean data
	//and creates an array of [Date, Deep, Wake, Light, REM] per moon phase

	private int[] fitbit, fq, fullMoon, lq, newMoon; 


	public DataToKeep(int[] fitbit){

		phaseSleepByDate(fitbit);

	}

	public void phaseSleepByDate(int[] fitbit){

		this.fitbit = fitbit;  //fitbit is the length of LunarSleep string
		int[] tempFQ = new int[fitbit.length];
		int[] tempFullMoon = new int[fitbit.length];
		int[] tempLQ = new int[fitbit.length];
		int[] tempNewMoon = new int[fitbit.length];


		LunarDB checkAgainst = new LunarDB(); //lunar dates for populating Phase to Sleep Arrays

		int j, k, l, m;
		j = k = l = m = 0;

		for(int i = 0; i < fitbit.length; i = i+5){ //setting Date, Deep, Wake, Light, REM

			if ((checkAgainst.isFQ(fitbit[i]))){
				for(int a = 0; a < 5; a++){
					tempFQ[a + j] = fitbit[a + i];
					}
				j = j + 5;
				}
			else if((checkAgainst.isFullMoon(fitbit[i]))){
				for(int a = 0; a < 5; a++){
					tempFullMoon[a + k] = fitbit[a + i];
					}
				k = k + 5;
				}
			else if((checkAgainst.isLQ(fitbit[i]))){
				for(int a = 0; a < 5; a++){
					tempLQ[a + l] = fitbit[a + i];
					}
				l = l + 5;
				}
			else if((checkAgainst.isNewMoon(fitbit[i]))){
				for(int a = 0; a < 5; a++){
					tempNewMoon[a + m] = fitbit[a + i];
					}
				m = m + 5;
				}

		}	

		fq = new int[j];
		fullMoon = new int[k];
		lq = new int[l];
		newMoon = new int[m];

		for (int i = 0; i < j; i++){
			fq[i] = tempFQ[i];
		}
		for (int i = 0; i < k; i++){
			fullMoon[i] = tempFullMoon[i];
		}
		for (int i = 0; i < l; i++){
			lq[i] = tempLQ[i];
		}
		for (int i = 0; i < m; i++){
			newMoon[i] = tempNewMoon[i];
		}

	}

	public int[] getFitBit(){
		return fitbit;
	}

	public int[] getFQ(){
		return fq;
	}

	public int[] getFullMoon(){
		return fullMoon;
	} 

	public int[] getLQ(){
		return lq;
	}

	public int[] getNewMoon(){
		return newMoon;
	}
}
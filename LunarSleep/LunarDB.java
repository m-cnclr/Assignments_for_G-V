import java.util.Arrays;

public final class LunarDB{

	//this file creates 
	//these date objects will be used to create arrays of Deep, REM, Light, and Awake per Moon Phase
	//it will only be called from the program launch class

	private int count, numDaysCounted;
	private int[] newMoon;  
	private int[] fq;					
	private int[] fullMoon;					
	private int[] lq;	
	private String[] lunarArray;	

	public LunarDB(){

		lunarArray = new String[]{
			"First Quarter","42799","42805",
			"Full Moon","42806","42813",
			"Last Quarter","42814","42821",
			"New Moon","42822","42827",
			"First Quarter","42828","42835",
			"Full Moon","42836","42843",
			"Last Quarter","42844","42850",
			"New Moon","42851","42857",
			"First Quarter","42858","42864",
			"Full Moon","42865","42873",
			"Last Quarter","42874","42879",
			"New Moon","42880","42886",
			"First Quarter","42887","42894",
			"Full Moon","42895","42902",
			"Last Quarter","42903","42909",
			"New Moon","42910","42916",
			"First Quarter","42917","42924",
			"Full Moon","42925","42931",
			"Last Quarter","42932","42938",
			"New Moon","42939","42945",
			"First Quarter","42946","42953",
			"Full Moon","42954","42961",
			"Last Quarter","42962","42967",
			"New Moon","42968","42975",
			"First Quarter","42976","42983",
			"Full Moon","42984","42990",
			"Last Quarter","42991","42997",
			"New Moon","42998","43005",
			"First Quarter","43006","43012",
			"Full Moon","43013","43019",
			"Last Quarter","43020","43026",
			"New Moon","43027","43034",
			"First Quarter","43035","43042",
			"Full Moon","43043","43048",
			"Last Quarter","43049","43056",
			"New Moon","43057","43064",
			"First Quarter","43065","43071",
			"Full Moon","43072","43078",
			"Last Quarter","43079","43086",
			"New Moon","43087","43094",
			"First Quarter","43095","43101",
			"Full Moon","43102","43107",
			"Last Quarter","43108","43116",
			"New Moon","43117","43123",
			"First Quarter","43124","43130",
			"Full Moon","43131","43137",
			"Last Quarter","43138","43145",
			"New Moon","43146","43145"
			};

		createPhases(lunarArray);
	}

	private void createPhases(String[] lunarArray){

		int j, k, l, m, n, o;
		numDaysCounted = lunarArray.length/6;
		//System.out.println(numDaysCounted);
		fq = new int[numDaysCounted];
		newMoon = new int[numDaysCounted];
		lq = new int[numDaysCounted];
		fullMoon = new int[numDaysCounted];
		l = m = n = o = 0;

		for(int i = 0; i < lunarArray.length; i = i+3){

			j = i + 1;
			k = i + 2;

			if (lunarArray[i].equals("First Quarter")){
				fq[l] = Integer.parseInt(lunarArray[j]);
				fq[l+1] = Integer.parseInt(lunarArray[k]);
				l = l + 2;;
				}
			else if (lunarArray[i].equals("Full Moon")){
				fullMoon[m] = Integer.parseInt(lunarArray[j]);
				fullMoon[m+1] = Integer.parseInt(lunarArray[k]);
				m = m + 2;
				}
			else if (lunarArray[i].equals("Last Quarter")){
				lq[n] = Integer.parseInt(lunarArray[j]);
				lq[n+1] = Integer.parseInt(lunarArray[k]);
				n = n + 2;
				}
			else if(lunarArray[i].equals("New Moon")){
				newMoon[o] = Integer.parseInt(lunarArray[j]);
				newMoon[o+1] = Integer.parseInt(lunarArray[k]);
				o = o + 2;
				}
			}

/*			System.out.println("The First Quarter Array is: ");
			System.out.println(Arrays.toString(fq));
			System.out.println("The Full Moon Array is: ");
			System.out.println(Arrays.toString(fullMoon));
			System.out.println("The Last Quarter Array is: ");
			System.out.println(Arrays.toString(lq));
			System.out.println("The New Moon Array is: ");
			System.out.println(Arrays.toString(newMoon));*/

		}

		public Boolean isFQ(int date){
			for(int i = 0; i < fq.length; i = i +2){
				if((fq[i] < date) && (date <= fq[i + 1])){
					return true;
				}
			}

			return false;
		}

		public Boolean isFullMoon(int date){
			for(int i = 0; i < fullMoon.length; i = i +2){
				if((fullMoon[i] < date) && (date <= fullMoon[i + 1])){
					return true;
				}
			}

			return false;
		}

		public Boolean isLQ(int date){
			for(int i = 0; i < lq.length; i = i +2){
				if((lq[i] < date) && (date <= lq[i + 1])){
					return true;
				}
			}

			return false;
		}

		public Boolean isNewMoon(int date){
			for(int i = 0; i < newMoon.length; i = i +2){
				if((newMoon[i] < date) && (date <= newMoon[i + 1])){
					return true;
				}
			}

			return false;
		}

		public String[] getLunarArray(){
			return lunarArray;
		}

		public int[] getNewMoon(){
			return newMoon;
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

	public static void main(String[] args){ 

		String[] lunarArray = new String[]{
			"First Quarter","42799","42805",
			"Full Moon","42806","42813",
			"Last Quarter","42814","42821",
			"New Moon","42822","42827",
			"First Quarter","42828","42835",
			"Full Moon","42836","42843",
			"Last Quarter","42844","42850",
			"New Moon","42851","42857",
			"First Quarter","42858","42864",
			"Full Moon","42865","42873",
			"Last Quarter","42874","42879",
			"New Moon","42880","42886",
			"First Quarter","42887","42894",
			"Full Moon","42895","42902",
			"Last Quarter","42903","42909",
			"New Moon","42910","42916",
			"First Quarter","42917","42924",
			"Full Moon","42925","42931",
			"Last Quarter","42932","42938",
			"New Moon","42939","42945",
			"First Quarter","42946","42953",
			"Full Moon","42954","42961",
			"Last Quarter","42962","42967",
			"New Moon","42968","42975",
			"First Quarter","42976","42983",
			"Full Moon","42984","42990",
			"Last Quarter","42991","42997",
			"New Moon","42998","43005",
			"First Quarter","43006","43012",
			"Full Moon","43013","43019",
			"Last Quarter","43020","43026",
			"New Moon","43027","43034",
			"First Quarter","43035","43042",
			"Full Moon","43043","43048",
			"Last Quarter","43049","43056",
			"New Moon","43057","43064",
			"First Quarter","43065","43071",
			"Full Moon","43072","43078",
			"Last Quarter","43079","43086",
			"New Moon","43087","43094",
			"First Quarter","43095","43101",
			"Full Moon","43102","43107",
			"Last Quarter","43108","43116",
			"New Moon","43117","43123",
			"First Quarter","43124","43130",
			"Full Moon","43131","43137",
			"Last Quarter","43138","43145",
			"New Moon","43146","43145"
			};

			System.out.println(lunarArray.length);

			LunarDB d = new LunarDB();
			//d.createPhases(lunarArray);


		}

	}
	
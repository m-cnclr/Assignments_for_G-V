public class StringUtils{



	public static String upperCase(String string){

		// YOUR CODE HERE
		String newString;
		newString = string.toUpperCase();
		return newString;

	}


	public static String withoutSpecials(String string){

		// YOUR CODE HERE
		String newString;
		newString = string.replaceAll("[^a-zA-Z0-9]", "");
		newString = newString.replaceAll("[ ]", "");
		return newString;

	}


	public static String reverse(String string){

		// YOUR CODE HERE
		String newString = "";
		for(int i = string.length()-1; i >= 0; i--){
			newString = newString + string.charAt(i);
		}

		return newString;

	}

	public static int numberOfWords(String string){

		// YOUR CODE HERE
		String newString = string.trim();
		if(newString.isEmpty()){
			return 0;
		}
		
		return newString.split("\\s+").length;
	}


	public static String[] splitSentences(String string){

		// YOUR CODE HERE
		String[] newStringArray = string.split("\\.");
		return newStringArray;

	}

	//[...]
}

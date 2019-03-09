public class Palindrome{


	private static boolean isPalindrome( String string ) {

		// YOUR CODE HERE
		String newString = StringUtils.withoutSpecials(string);
		newString = StringUtils.upperCase(newString);
		if (StringUtils.reverse(newString).equals(newString)){
			return true;
		}
		else {
			return false;
		}
	}

	public static void palindromes( String string ) {
		
		System.out.println("\nStarting palindromes\n");

		// YOUR CODE HERE
		String[] set = StringUtils.splitSentences(string);

		for(int i = 0; i < set.length; i++){
	//		System.out.println("\"" + set[i] + "\""); 

			if(isPalindrome(set[i])){
				System.out.println("\"" + set[i] + "\"" + " is a palindrome.");
			
			}else {
				System.out.println("\"" + set[i] + "\"" + " is not a palindrome.");
			
			}

		}
	}


	public static void main ( String [ ] args ) {

		String input = "a. 0110. madam . Call it a day. nURSes, RUN!!!."
		 + " A man, a plan, a canal, Panama. Was it a car or a cat "
		 + " I saw. No 'x' in Nixon. Break a leg.  Was it Eliot's "
		 + "toilet I saw?";


		palindromes(input);

	}
}
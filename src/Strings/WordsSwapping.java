package Strings;

public class WordsSwapping {

	public static void main(String[] args) {

		 String inputString = "Hi Hello How  are you ";
	        
	        // Remove extra spaces and trim the string
	        String trimmedString = inputString.trim().replaceAll("\\s+", " ");
	        
	        System.out.println(trimmedString);

	       //  Count the number of words
	        String[] words = trimmedString.split(" ");
	        
	        int wordCount = words.length;
	        System.out.println("Number of words: " + wordCount);

	        //Swap adjacent words
	        StringBuilder swappedString = new StringBuilder();
	        for (int i = 0; i < wordCount - 1; i +=2) {
	            swappedString.append(words[i + 1]).append(" ").append(words[i]).append(" ");
	        }
	        if (wordCount % 2 != 0) {
	            swappedString.append(words[wordCount - 1]);
	        }

	        System.out.println("Swapped string: " + swappedString.toString());

	}
}





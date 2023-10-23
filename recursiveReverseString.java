package SS;

public class recursiveReverseString {

	public static void main(String[] args) {
        String word = "mississippi";
        String reversedStr = reverseString(word);
        System.out.println(reversedStr);
    }
	
	public static String reverseString(String word) {
		// Base case
        if (word.length() <= 1) {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
	}

}

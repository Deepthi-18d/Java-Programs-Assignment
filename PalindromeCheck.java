package basics;

public class PalindromeCheck {

	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
	    }

	    public static void main(String[] args) {
	        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
	    }
	}


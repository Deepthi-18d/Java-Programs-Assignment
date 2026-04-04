package basics;

public class TruncateString {

	    public static String truncate(String str, int maxLength) {
	        if (str == null) return null;
	        return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
	    }

	    public static void main(String[] args) {
	        System.out.println(truncate("Hello World", 5));
	    }
	}


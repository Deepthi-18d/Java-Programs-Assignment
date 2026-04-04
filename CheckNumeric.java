package basics;

public class CheckNumeric {
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        return str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("12345")); 
	    }
	}


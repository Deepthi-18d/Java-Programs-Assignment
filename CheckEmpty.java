package basics;

public class CheckEmpty {

	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        System.out.println(isNullOrEmpty("")); // true
	    }
	}

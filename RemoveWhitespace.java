package basics;

public class RemoveWhitespace {
	    public static String removeWhitespace(String str) {
	        return str == null ? null : str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        System.out.println(removeWhitespace("Hello World")); // HelloWorld
	    }
	}


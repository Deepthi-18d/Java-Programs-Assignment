package basics;
public class PerformanceTest{

	    public static void main(String[] args) {

	        long startTime = System.currentTimeMillis();

	        // StringBuffer Test
	        StringBuffer sb = new StringBuffer("Java");
	        for (int i = 0; i < 10000; i++) {
	            sb.append("AIET");
	        }
	        System.out.println("Time taken by StringBuffer: " 
	                + (System.currentTimeMillis() - startTime) + " ms");

	        // StringBuilder Test
	        startTime = System.currentTimeMillis();

	        StringBuilder sb2 = new StringBuilder("Java");
	        for (int i = 0; i < 10000; i++) {
	            sb2.append("AIET");
	        }
	        System.out.println("Time taken by StringBuilder: " 
	                + (System.currentTimeMillis() - startTime) + " ms");
	    }
	}

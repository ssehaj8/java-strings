public class NullPointer {

	// Method to generate NullPointerException
    	public static void generateNullPointerException() {
        	String text = null;
        	// This will throw NullPointerException
        	System.out.println(text.length());
    	}

    	// Method to handle NullPointerException
    	public static void handleNullPointerException() {
        	String text = null;
        	try {
            		System.out.println(text.length());
        	} 
		catch (NullPointerException e) {
            		System.out.println("Caught NullPointerException: " + e.getMessage());
        	} 
		catch (Exception e) {
            		System.out.println("Caught generic exception: " + e.getMessage());
        	}
    	}

    	public static void main(String[] args) {
        	generateNullPointerException();

        	// Handle the exception
        	handleNullPointerException();
    	}
} 

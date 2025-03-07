import java.util.Scanner;

public class CanVote {

    	// Method to determine voting eligibility
    	public static String[][] checkCanVote(int[] arr) {
        	String[][] res = new String[arr.length][2];

        	for (int i = 0; i < arr.length; i++) {
            		res[i][0] = String.valueOf(arr[i]);
            		if (arr[i] < 0) {
                		res[i][1] = "Invalid age";
            		} 
            		else if (arr[i] >= 18) {
                		res[i][1] = "Can vote";
            		} 
            		else {
                		res[i][1] = "Cannot vote";
            		}
        	}

        	return res;
    	}

    	// Method to display results in tabular format
    	public static void displayResults(String[][] res) {
        	System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        	for (int i = 0; i < res.length; i++) {
            		System.out.printf("%-10s %-15s%n", res[i][0], res[i][1]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	// Get ages of students
        	int[] ages = new int[10];
        	System.out.print("Enter age of 10 students: ");
        	for (int i = 0; i < 10; i++) {
            		ages[i] = sc.nextInt();
        	}

        	// Determine voting eligibility
        	String[][] results = checkCanVote(ages);

        	// Display results
        	displayResults(results);
    	}
}

// I/P -> 23 12 15 18 56 43 25 23 8 10
/* O/P ->
Age        Voting Eligibility
23         Can vote       
12         Cannot vote    
15         Cannot vote    
18         Can vote       
56         Can vote       
43         Can vote       
25         Can vote       
23         Can vote       
8          Cannot vote    
10         Cannot vote    
*/

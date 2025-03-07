import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    	// Method to generate random PCM scores for students
    	public static int[][] generateScores(int students) {
        	Random rand = new Random();
        	int[][] scores = new int[students][3];

        	for (int i = 0; i < students; i++) {
            	scores[i][0] = rand.nextInt(41) + 60; // Physics
            	scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            	scores[i][2] = rand.nextInt(41) + 60; // Maths
        	}
        	return scores;
    	}

    	// Method to calculate total, average, and percentage
    	public static double[][] calculateStats(int[][] scores) {
        	int students = scores.length;
        	double[][] stats = new double[students][3];

        	for (int i = 0; i < students; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double avg = total / 3.0;
            		double percentage = Math.round((total / 300.0) * 10000) / 100.0;

            		stats[i][0] = total;
            		stats[i][1] = Math.round(avg * 100.0) / 100.0;
            		stats[i][2] = percentage;
        	}
        	return stats;
    	}

    	// Method to calculate grade based on percentage
    	public static String[] calculateGrades(double[][] stats) {
        	String[] grades = new String[stats.length];

        	for (int i = 0; i < stats.length; i++) {
            		double percentage = stats[i][2];
            		if (percentage >= 80) {
              			grades[i] = "A";
            		}
            		else if (percentage >= 70 && percentage <= 79 ) {
              			grades[i] = "B";
            		}
            		else if (percentage >= 60 && percentage <= 69) {
              			grades[i] = "C";
            		}
            		else if (percentage >= 50 && percentage <= 59) {
              			grades[i] = "D";
            		}
            		else if (percentage >= 40 && percentage <= 49) {
              			grades[i] = "E";
            		}
            		else {
              			grades[i] = "R";
            		}	
        	}
        	return grades;
    	}

    	// Method to display the scorecard
    	public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        	System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");

        	for (int i = 0; i < scores.length; i++) {
            		System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", (i + 1), scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of students: ");
        	int students = sc.nextInt();
      
        	int[][] scores = generateScores(students);
      
        	double[][] stats = calculateStats(scores);
        	String[] grades = calculateGrades(stats);

        	displayScorecard(scores, stats, grades);
    	}
} 



// I/P -> Enter number of students: 4
/* O/P ->
Student    Physics    Chemistry  Maths      Total      Average    Percentage Grade     
1          65         95         82         242        80.67      80.67      A         
2          68         66         77         211        70.33      70.33      B         
3          92         100        61         253        84.33      84.33      A         
4          73         67         77         217        72.33      72.33      B         
*/

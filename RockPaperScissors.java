import java.util.Scanner;

public class RockPaperScissors {
    	// Method to get user choice
    	public static String getUserChoice() {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter your choice (Rock/Paper/Scissors): ");
        	return sc.nextLine();
    	}

    	// Method to get computer's choice
    	public static String getComputerChoice() {
        	int choice = (int) (Math.random() * 3);
        	return switch (choice) {
            		case 0 -> "Rock";
            		case 1 -> "Paper";
            		case 2 -> "Scissors";
            		default -> "";
        	};
    	}

    	// Method to determine the winner
    	public static String findWinner(String s1, String s2) {
        	if (s1.equals(s2)) {
            		return "Draw";
        	}
        	if ((s1.equals("Rock") && s2.equals("Scissors")) || (s1.equals("Paper") && s2.equals("Rock")) || (s1.equals("Scissors") && s2.equals("Paper"))) {
            		return "User";
        	}
        	return "Computer";
    	}

    	// Method to calculate win stats and percentages
    	public static String[][] calculateStats(int user, int comp, int games) {
        	String[][] stats = new String[2][3];
        	stats[0][0] = "User";
        	stats[0][1] = String.format("%.2f%%", (user * 100.0 / games));
        	stats[0][2] = String.valueOf(user / (double) games);
        	stats[1][0] = "Computer";
        	stats[1][1] = String.format("%.2f%%", (comp * 100.0 / games));
        	stats[1][2] = String.valueOf(comp / (double) games);
        	return stats;
    	}

    	// Method to display results
    	public static void displayResults(int n, int user, int comp) {
        	System.out.println("\nGame Results:");
        	System.out.printf("%-10s %-10s %-10s %-10s\n", "Game", "User", "Computer", "Winner");
    

        	for (int i = 1; i <= n; i++) {
            		String userChoice = getUserChoice();
            		String computerChoice = getComputerChoice();
            		String winner = findWinner(userChoice, computerChoice);

            		if (winner.equals("User")) user++;
            		if (winner.equals("Computer")) comp++;

            		System.out.printf("%-10d %-10s %-10s %-10s\n", i, userChoice, computerChoice, winner);
        	}

        	String[][] stats = calculateStats(user, comp, n);
        	System.out.println("\nWin Percentage and Average Wins:");
        	System.out.printf("%-10s %-10s %-10s\n", "Player", "Win %", "Avg Wins");
        	for (int i = 0; i < stats.length; i++) {
            		System.out.printf("%-10s %-10s %-10s\n", stats[i][0], stats[i][1], stats[i][2]);
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of games: ");
        	int games = sc.nextInt();
        	//User's and Computer's win count
        	int user = 0, comp = 0;

        	displayResults(games, user, comp);
    	}
}

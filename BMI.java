import java.util.Scanner;

public class BMI {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	double[][] data = new double[10][2];

        	System.out.println("Enter weight (kg) and height (cm) for 10 people:");
        	for (int i = 0; i < 10; i++) {
            		System.out.print("Person " + (i + 1) + " weight (kg): ");
            		data[i][0] = sc.nextDouble();
            		System.out.print("Person " + (i + 1) + " height (cm): ");
            		data[i][1] = sc.nextDouble();
        	}

        	String[][] results = calculateBMI(data);
        	displayResults(results);
    	}

    	// Method to calculate BMI and status
    	public static String[][] calculateBMI(double[][] data) {
        	String[][] res = new String[data.length][4];

        	for (int i = 0; i < data.length; i++) {
            		double weight = data[i][0];
            		double height = data[i][1] / 100.0; // converting cm to meters
            		double bmi = weight / (height * height);

            		res[i][0] = String.valueOf(data[i][0]); // weight
            		res[i][1] = String.valueOf(data[i][1]); // height
            		res[i][2] = String.format("%.2f", bmi);

            		if (bmi < 18.5) {
                		res[i][3] = "Underweight";
            		} 
			else if (bmi < 24.9) {
                		res[i][3] = "Normal weight";
            		} 
			else if (bmi < 29.9) {
                		res[i][3] = "Overweight";
            		} 
			else {
                		res[i][3] = "Obese";
            		}
        	}
        	return res;
    	}

    	// Method to display the results
    	public static void displayResults(String[][] results) {
        	System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        	for (String[] res : results) {
            		System.out.printf("%-10s %-10s %-10s %-15s\n", res[0], res[1], res[2], res[3]);
        	}
    	}

}


/*
Input : Enter weight (kg) and height (cm) for 10 people:
Person 1 weight (kg): 45
Person 1 height (cm): 143
Person 2 weight (kg): 56
Person 2 height (cm): 154
Person 3 weight (kg): 90
Person 3 height (cm): 161
Person 4 weight (kg): 57
Person 4 height (cm): 132
Person 5 weight (kg): 89
Person 5 height (cm): 192 
Person 6 weight (kg): 54
Person 6 height (cm): 143
Person 7 weight (kg): 38
Person 7 height (cm): 136
Person 8 weight (kg): 45
Person 8 height (cm): 134
Person 9 weight (kg): 56
Person 9 height (cm): 159
Person 10 weight (kg): 58
Person 10 height (cm): 345 

Output:
Weight(kg) Height(cm) BMI        Status         
45.0       143.0      22.01      Normal weight  
56.0       154.0      23.61      Normal weight  
90.0       161.0      34.72      Obese          
57.0       132.0      32.71      Obese          
89.0       192.0      24.14      Normal weight  
54.0       143.0      26.41      Overweight     
38.0       136.0      20.54      Normal weight  
45.0       134.0      25.06      Overweight     
56.0       159.0      22.15      Normal weight  
58.0       345.0      4.87       Underweight    
*/

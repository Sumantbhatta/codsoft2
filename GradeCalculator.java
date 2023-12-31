import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayBorder();
        System.out.println("Welcome to the Grade Calculator!");
        System.out.println("================================");

        // Step 1: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        System.out.println("\nEnter marks obtained in each subject:");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Step 2: Calculate total marks
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 3: Assign grades based on the average percentage
        char grade = calculateGrade(averagePercentage);

        // Step 4: Display results
        displayResults(totalMarks, averagePercentage, grade);
        displayBorder();
    }

    // Method to calculate grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display results
    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("----------------------------");
        System.out.println("Total Marks:       " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade:             " + grade);
        System.out.println("----------------------------");
    }

    // Method to display a border
    private static void displayBorder() {
        System.out.println("================================");
    }
}

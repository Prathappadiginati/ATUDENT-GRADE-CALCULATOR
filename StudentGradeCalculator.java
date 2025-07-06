package Task2;

	import java.util.Scanner;

	public class StudentGradeCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        int totalMarks = 0;

	        for (int i = 1; i <= numSubjects; i++) {
	            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
	            int marks = scanner.nextInt();

	            while (marks < 0 || marks > 100) {
	                System.out.print("Invalid marks. Please enter again (0 to 100): ");
	                marks = scanner.nextInt();
	            }

	            totalMarks += marks;
	        }

	        double average = (double) totalMarks / numSubjects;
	        char grade;

	        if (average >= 90) {
	            grade = 'A';
	        } else if (average >= 80) {
	            grade = 'B';
	        } else if (average >= 70) {
	            grade = 'C';
	        } else if (average >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("\n===== Results =====");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.printf("Average Percentage: %.2f%%\n", average);
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
	}





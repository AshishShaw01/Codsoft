package Codsoft;
import java.util.Scanner;

public class grade_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];
        int totalMarks = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + " out of 100: ");
            marks[i] = scanner.nextInt();


            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input!! Please enter marks between 0 and 100: ");
                marks[i] = scanner.nextInt();
            }

            totalMarks += marks[i];
        }

        double percentage = totalMarks / n;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}
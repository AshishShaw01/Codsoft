package Codsoft;
import java.util.Scanner;
public class grade_calculator {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n = scanner.nextInt();

        float[] marks = new float[n];

        float totalMarks = 0;
        
        for(int i=1; i<=n; i++){

            System.out.println("Enter marks of subject "+i+" out of 100 :" );
            marks[i] = scanner.nextFloat();

            while(marks[i] < 0 || marks[i] > 100){

                System.out.println("Invalid Input!!");
                marks[i] = scanner.nextFloat();

            }

            totalMarks += marks[i];
        }

        float percentage = totalMarks / n;
        
        char grade;
        if(percentage >= 90){
            grade = 'A';
        }
        else if(percentage >= 80){
            grade = 'B';
        }
        else if(percentage >= 70){
            grade = 'C';
        }
        else if(percentage >= 60){
            grade = 'D';
        }
        else if(percentage >= 50){
            grade = 'E';
        }
        else{
            grade = 'F';
        }

        System.out.println("Total Marks Obtained: "+totalMarks);
        System.out.println("Precentage Obtained: "+percentage);
        System.out.println("Grade Obtained: "+grade);
        scanner.close();

    }
}

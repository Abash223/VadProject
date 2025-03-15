import java.util.*;
public class example {
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } 
        else if (marks >= 75) {
            return "B";
        } 
        else if (marks >= 50) {
            return "C";
        } 
        else {
            return "F";
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = input.nextInt();
            String grade = calculateGrade(marks);
            System.out.println("Grade for student " + i + ": " + grade);
        }
    }
}

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter marks for five subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averageMarks = totalMarks / 5.0;

        char grade;
        if (averageMarks >= 90) {
            grade = 'E';  // Excellent
        } else if (averageMarks >= 80) {
            grade = 'A';
        } else if (averageMarks >= 70) {
            grade = 'B';
        } else if (averageMarks >= 60) {
            grade = 'C';
        } else {
            grade = 'F';  // Fail
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

    }
}
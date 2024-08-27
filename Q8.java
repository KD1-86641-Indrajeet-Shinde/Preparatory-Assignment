import java.util.Scanner;

class Student {
    private String studentName;
    private String rollNo;  // rollNo can be an alphanumeric string
    private int totalMarks;

    public Student(String studentName, String rollNo, int totalMarks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public void displayStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter the student's roll number: ");
        String rollNo = scanner.nextLine();
        
        System.out.print("Enter the student's total marks: ");
        int totalMarks = scanner.nextInt();
        
        Student student = new Student(studentName, rollNo, totalMarks);
        
        System.out.println("\nStudent Details:");
        student.displayStudentData();
    }
}
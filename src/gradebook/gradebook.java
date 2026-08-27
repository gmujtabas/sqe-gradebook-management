import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = input.nextLine();

        Student student = new Student(name, studentId);

        System.out.print("Enter number of scores: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();
            student.addScore(score);
        }

        System.out.println("\nStudent Name: " + student.name);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Average: " + student.average());

        input.close();
    }
}
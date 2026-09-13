import java.util.ArrayList;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        for (int j = 0; j < numberOfStudents; j++) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student ID: ");
            String studentId = input.nextLine();

            boolean duplicate = false;

            for (Student s : students) {
                if (s.studentId.equals(studentId)) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.println("Student ID already exists. Enter a different ID.");
                j--;
                continue;
            }

            Student student = new Student(name, studentId);

            System.out.print("Enter number of scores: ");
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter score " + (i + 1) + ": ");
                int score = input.nextInt();
                student.addScore(score);
            }

            input.nextLine();
            students.add(student);
        }

        for (Student student : students) {
            System.out.println("\nStudent Name: " + student.name);
            System.out.println("Student ID: " + student.studentId);
            System.out.println("Average: " + student.average());
        }

        input.close();
    }

    public static char letterGrade(int score) {
    if (score < 0 || score > 100) {
        throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
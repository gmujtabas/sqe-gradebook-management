import java.util.ArrayList;

public class Roster {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        int scoreCount = student.scores.size();

        if (scoreCount < 1 || scoreCount > 6) {
            throw new IllegalArgumentException(
                "Student must have between 1 and 6 scores"
            );
        }

        students.add(student);
    }
}

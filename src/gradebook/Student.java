import java.util.ArrayList;

public class Student {
    String name;
    String studentId;
    ArrayList<Integer> scores;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.scores = new ArrayList<>();
    }

    public void addScore(int newScore) {
        scores.add(newScore);
    }

    public double average() {
        if (scores.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (int score : scores) {
            total += score;
        }

        return (double) total / scores.size();
    }
}
import java.util.ArrayList;

public class Student {
    String name;
    String studentId;
    ArrayList<Integer> scores;

    public Student(String name,String studentId) {
        this.name=name;
        this.studentId=studentId;
        this.scores=new ArrayList<>();
    }

    public double average() {
        if (scores.isEmpty()) {
            return 0.0;
        }
        int sum=0;
        for (int score:scores) {
            sum+=score;
        }
        return (double) sum/scores.size();
    }
}
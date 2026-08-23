import java.util.ArrayList;

public class Student {
    String name;
    String rollNo;
    ArrayList<Integer> scores;

    public Student(String name,String rollNo) {
        this.name=name;
        this.rollNo=rollNo;
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

    public void addScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }
        scores.add(score);
    }
}
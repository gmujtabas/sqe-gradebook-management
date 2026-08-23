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

    /**
     * Adds a score to the student's list of scores.
     * @param score the score to add; must not be negative
     * @throws IllegalArgumentException if the score is negative
     */
    
    public void addScore(int newScore) {
        if (newScore < 0 || newScore > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        scores.add(newScore);
    }
}
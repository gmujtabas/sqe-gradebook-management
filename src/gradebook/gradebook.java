import java.util.ArrayList;

public class Student {
    String name;
    String idNumber;
    ArrayList<Integer> scores;

    public Student(String name,String idNumber) {
        this.name=name;
        this.idNumber=idNumber;
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
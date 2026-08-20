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
}

package practice08;

public class Klass {

    private int number;

    private Student leader;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass() {
        number = 0;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        String output = "Class " + number;
        return output;
    }

    public void assignLeader(Student student){
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }

}

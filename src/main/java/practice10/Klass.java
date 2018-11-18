package practice10;

public class Klass {

    private int number;

    private Student leader = new Student();

    private Student member = new Student();

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
        if (member != null && member == student){
            leader = student;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student){
        member = student;
    }
}

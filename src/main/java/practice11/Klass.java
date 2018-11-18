package practice11;

public class Klass {

    private int number;

    private Student leader = new Student();

    private Student member = new Student();

    Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student student){
        if (member != null && member.getId() == student.getId()){
            if (this.getNumber() != student.getKlass().getNumber()){
                leader = new Student(student.getId(),student.getName(),student.getAge(),this);
            }else{
                leader = student;
            }
            if (this.getTeacher()!= null){
                this.getTeacher().leaderAssigned(leader);
            }
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student){
        if (this.getNumber() != student.getKlass().getNumber()){
            member = new Student(student.getId(),student.getName(),student.getAge(),this);
        }else{
            member = student;
        }
        if (this.getTeacher() != null){
            this.getTeacher().memberJoin(member);
        }
    }
}

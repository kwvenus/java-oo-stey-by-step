package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(){

    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass.setNumber(klass);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        String output = super.introduce() + " I am a Student.";
        if (klass.getLeader() == this){
            output += " I am Leader of Class " + klass.getNumber() + ".";
        }else{
            output += " I am at Class " + getKlass().getNumber() + ".";
        }
        return output;
    }
}

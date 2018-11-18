package practice07;

public class Student extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass.setNumber(klass);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        String output = super.introduce() + " I am a Student. I am at Class " + getKlass().getNumber() + ".";
        return output;
    }
}

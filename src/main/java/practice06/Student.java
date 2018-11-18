package practice06;

public class Student extends Person{
    private int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int class_num) {
        super(name, age);
        setKlass(class_num);
    }

    public String introduce(){
        String output = super.introduce() + " I am a Student. I am at Class " + getKlass() + ".";
        return output;
    }

}

package practice07;

import static sun.misc.Version.println;

public class Teacher extends Person{

    private Klass klass;
    private String output = super.introduce() + " I am a Teacher. ";

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        klass = new Klass(0);
    }

    public String introduce(){
        if (klass.getNumber() == 0){
            output += "I teach No Class.";
        } else {
            output += "I teach Class " + klass.getNumber() + ".";
        }
        return output;
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == klass.getNumber()){
            output += "I teach " + student.getName() + ".";
        }else{
            output += "I don't teach " + student.getName() + ".";
        }
        return output;
    }
}

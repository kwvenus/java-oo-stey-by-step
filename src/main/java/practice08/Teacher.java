package practice08;

public class Teacher extends Person{

    private Klass klass;
    private String output = super.introduce() + " I am a Teacher. ";

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
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

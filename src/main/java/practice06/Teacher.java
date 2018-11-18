package practice06;

public class Teacher extends Person{

    public Teacher(String name, int age, int kclass) {
        super(name, age);
        setKlass(kclass);
    }

    public Teacher(int klass) {
        this.klass = klass;
    }

    private int klass = 0;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        String output = super.introduce() + " I am a Teacher. ";
        if (klass == 0){
            output += "I teach No Class.";
        } else {
            output += "I teach Class " + klass + ".";
        }
        return output;
    }
}

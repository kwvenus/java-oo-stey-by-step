package practice10;

import java.util.LinkedList;

public class Teacher extends Person{

    private Klass klass;
    private LinkedList<Klass> klassLinkedList;
    private String output = super.introduce() + " I am a Teacher. ";

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass = new Klass(0);
        klassLinkedList = new LinkedList<Klass>();
    }

    public LinkedList<Klass> getClasses() {
        return klassLinkedList;
    }

    public String introduce(){
        if (klassLinkedList.isEmpty()){
            output += "I teach No Class.";
        } else {
            output += "I teach Class ";
                    for (int i = 0; i < klassLinkedList.size(); i ++){
                        output += klassLinkedList.get(i).getNumber();
                        if (i != klassLinkedList.size()-1){
                            output += ", ";
                        }else {
                            output += ".";
                        }
                    }
        }
        return output;
    }

    public String introduceWith(Student student){
        if (klassLinkedList.contains(student.getKlass())){
            output += "I teach " + student.getName() + ".";
        }else{
            output += "I don't teach " + student.getName() + ".";
        }
        return output;
    }

    public boolean isTeaching(Student student){
        if (klassLinkedList.contains(student.getKlass())){
            return true;
        }else{
            return false;
        }
    }
}

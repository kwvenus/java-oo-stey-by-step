package practice10;

public class Person {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id, String name, int age){
        setId(id);
        setName(name);
        setAge(age);
    }

    public Person(){

    }

    public boolean equals(Object person) {
        if (id == ((Person)person).getId()){
            return true;
        }else{
            return false;
        }
    }

    public String introduce(){
        return backIntroduce();
    }

    private String backIntroduce(){
        String output = "My name is " + getName() + ". I am " + getAge() + " years old.";
        return output;
    }
}

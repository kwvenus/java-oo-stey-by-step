package practice06;

public class Person {
    private String name;
    private int age;

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

    public Person() {
    }

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String introduce(){
        return backIntroduce();
    }

    private String backIntroduce(){
        String output = "My name is " + getName() + ". I am " + getAge() + " years old.";
        return output;
    }
}

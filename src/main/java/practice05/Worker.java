package practice05;

public class Worker extends Person{

    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        String output =  super.introduce() + " I am a Worker. I have a job.";
        return output;
    }
}

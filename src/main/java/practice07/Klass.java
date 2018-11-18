package practice07;

public class Klass {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass() {
        number = 0;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        String output = "Class " + number;
        return output;
    }
}

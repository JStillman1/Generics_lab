package Wildcards;

public class Grampa {

    private String name;

    public Grampa(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grampa{" +
                "name='" + name + '\'' +
                "class='" + this.getClass() + "\'" +
                '}';
    }
}

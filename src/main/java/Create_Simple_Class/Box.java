package Create_Simple_Class;

public class Box <T> {
    private T t;
    
    public T get(){
        return this.t;
    }
    
    public void set(T t){
        this.t = t;
    }
}

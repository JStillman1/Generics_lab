package Class_With_Two_Params;

public class Pair <K, V>{

    private K k;
    private V v;

    public Pair(K k, V v){
        this.k = k;
        this.v = v;
    }




    //Getters and Setters
    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

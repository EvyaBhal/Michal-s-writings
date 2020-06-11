package Mammal;

public class Dog extends Canine {
    private String name;
    private int fleas;

    public Dog(double w, int ges, boolean v, String name, int f){
        super(w,ges,v);
        this.name = new String(name);
        fleas = f;
    }
    public void bark(){}
}

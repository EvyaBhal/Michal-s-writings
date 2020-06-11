package Mammal;

public class Cat extends Feline {
    private boolean spayed;
    public Cat(double w, int ges, boolean s, boolean ss){
        super(w,ges,s);
        spayed = ss;
    }
    public void scratch(){}
}

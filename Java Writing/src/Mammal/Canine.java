package Mammal;

public class Canine extends Mammal{
    private boolean vac;

    public Canine(double w, int ges, boolean vac){
        super(w,ges);
        this.vac = vac;
    }
    public void wail(){}
}

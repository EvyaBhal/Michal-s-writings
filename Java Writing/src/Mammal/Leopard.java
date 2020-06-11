package Mammal;

public class Leopard extends Feline{
    private int mates;
    public Leopard(double w, int ges, boolean spots, int mates){
        super(w,ges,spots);
        this.mates = mates;
    }

    public void roar(){}
    public  void prey(){}

}

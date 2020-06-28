package Point2D;

public class Cartesian implements Point2D{
    private double x;
    private double y;

    public Cartesian(double x , double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double getX() {

        return x;
    }

    @Override
    public void setX(double x) {

        this.x = x;
    }

    @Override
    public double getY() {

        return y;
    }

    @Override
    public void setY(double y) {

        this.y = y;
    }

    @Override
    public double getRho() {

        return Math.hypot(x,y);
    }

    @Override
    public void setRho(double rho) {
        this.x = rho* Math.cos(getPhi());
        this.y = rho* Math.sin(getPhi());
    }

    @Override
    public double getPhi() {

        return Math.atan2(y/x);
    }

    @Override
    public double getTanPhi() {

        return y/x;
    }

    @Override
    public void setPhi(double phi) {
        this.x = getRho()*Math.cos(getPhi());
        this.y = getRho()*Math.sin(getPhi());

    }

    @Override
    public Point2D middle(Point2D p) {
       double midx = (this.x+p.getX())/2;
       double midy = (this.x+p.getY())/2;
       Point2D midd = new Cartesian(midx,midy);
       return midd;
    }

    @Override
    public double angle(Point2D p) {

        return Math.abs((getPhi()-p.getPhi())) ;
    }

    @Override
    public double distance(Point2D p) {
        double i = (this.x-p.getX());
        double j = (this.y - p.getY());
        return Math.hypot(i,j);
    }
}

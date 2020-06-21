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
        return 0;
    }

    @Override
    public double getTanPhi() {
        return y/x;
    }

    @Override
    public void setPhi(double phi) {

    }

    @Override
    public Point2D middle(Point2D p) {
        return null;
    }

    @Override
    public double angle(Point2D p) {
        return 0;
    }

    @Override
    public double distance(Point2D p) {
        return 0;
    }
}

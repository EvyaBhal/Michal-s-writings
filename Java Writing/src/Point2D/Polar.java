package Point2D;

public class Polar implements Point2D{
    private double rho;
    private double phi;

    @Override
    public double getX() {
        return rho*Math.cos(phi);
    }

    @Override
    public void setX(double x) {
        rho = Math.hypot(x,getY());
        phi = Math.atan2(getY(),x);

    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public void setY(double y) {

    }

    @Override
    public double getRho() {
        return 0;
    }

    @Override
    public void setRho(double rho) {

    }

    @Override
    public double getPhi() {
        return 0;
    }

    @Override
    public double getTanPhi() {
        return 0;
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

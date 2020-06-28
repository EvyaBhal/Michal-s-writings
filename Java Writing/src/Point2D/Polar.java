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

        return rho*Math.sin(phi);
    }

    @Override
    public void setY(double y) {
        rho = Math.hypot(getX(),y);
        phi = Math.atan2(y/getX());

    }

    @Override
    public double getRho() {

        return rho;
    }

    @Override
    public void setRho(double rho) {
        this.rho = rho;
    }

    @Override
    public double getPhi() {

        return phi;
    }

    @Override
    public double getTanPhi() {

        return Math.tan(phi);
    }

    @Override
    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    //in the main we're getting the args in polar or cartesian way?
    public Point2D middle(Point2D p) {
        double midx = (getX()-p.getX())/2;
        double midy = (getY()-p.getY())/2;
        double midrho = p.getRho()/2;
        Point2D midp = new Polar(midrho,p.getPhi());
        return midp;
    }

    @Override
    public double angle(Point2D p) {
        return Math.abs(p.getPhi()-phi) ;
    }

    @Override
    public double distance(Point2D p) {

        return (rho-p.getRho());//is it the same angle? if it is then is it rho1-rho2?
    }
}

package pl.edu.pg.eti.ksg.po.lab1.transformacje;
import  java.lang.Math;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Obrot implements Transformacja{
    private double angle;
    Obrot(double angle)
    {
        this.angle=angle;
    }
    @Override
    public Punkt transformuj(Punkt p) {
        double x = p.getX()*cos(angle)-p.getY()*sin(angle);
        double y = p.getX()*sin(angle)+p.getY()*cos(angle);
        Punkt point= new Punkt(x, y);
        return point;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        return new Obrot(-angle);
    }
    public final double getAngle()
    {
        return angle;
    }
}

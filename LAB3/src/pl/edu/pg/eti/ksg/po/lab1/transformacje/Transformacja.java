package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public interface Transformacja{
    pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt transformuj(Punkt p);
    Transformacja getTransformacjaOdwrotna()
            throws BrakTransformacjiOdwrotnejException;
}

package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja{

    private Transformacja[] tab;

    public ZlozenieTransformacji(Transformacja[] tab)
    {
        this.tab=new Transformacja[tab.length];
        for(int i =0;i<tab.length;i++)
        {
            this.tab[i]=tab[i];
        }
    }
    @Override
    public Punkt transformuj(Punkt p) {
        for(int i =0;i<tab.length;i++)
        {
            p = tab[i].transformuj(p);
        }
        return p;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {

        Transformacja[] tab= new Transformacja[this.tab.length];
        for(int i =0;i<tab.length;i++)
        {
           tab[i]=this.tab[tab.length-i-1].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(tab);
    }
}

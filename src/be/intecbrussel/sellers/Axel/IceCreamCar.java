package be.intecbrussel.sellers.Axel;

import be.intecbrussel.eatable.Axel.Cone;
import be.intecbrussel.eatable.Axel.IceRocket;
import be.intecbrussel.eatable.Axel.Magnum;
import be.intecbrussel.eatable.Axel.PriceList;
import be.intecbrussel.sellers.Axel.IceCreamSeller;

public class IceCreamCar implements IceCreamSeller {
    private PriceList pricelist;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.pricelist = priceList;
        this.stock = stock;


    }
    //Niet zeker hoe moet ik rekening met de stock houden
    //Behalve als ik een static count variable gebruik
    @Override
    public Cone orderCone(Flavor[] a) throws NoMoreIceCreamException {
        Cone c = new Cone(a) ;
        //stock -= getProfit();


        return c ;

    }

    private Cone prepareCone(Flavor[] a){
        Cone c = new Cone(a) ;
        //totalProfit += getProfit();

        return c ;

    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket i = new IceRocket() ;
        //totalProfit += getProfit();

        return i ;
    }

    private Cone prepareRocket(Flavor[] a){
        Cone r = new Cone(a) ;
        //totalProfit += getProfit();

        return r ;
    }

    @Override
    public Magnum orderMagnum(MagnumType b) throws NoMoreIceCreamException {
        Magnum m =  new Magnum() ;
        //totalProfit += getProfit();

        return m ;

    }

    private Magnum prepareMagnum(MagnumType a){
        Magnum m = new Magnum();
        return m;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}

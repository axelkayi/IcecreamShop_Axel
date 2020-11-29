import be.intecbrussel.eatable.Axel.Cone;
import be.intecbrussel.eatable.Axel.IceRocket;
import be.intecbrussel.eatable.Axel.Magnum;
import be.intecbrussel.eatable.Axel.PriceList;
import be.intecbrussel.sellers.Axel.IceCreamSeller;

import java.util.ArrayList;
import java.util.List;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(){
        List<PriceList> pricelist = new ArrayList<>();
    }

    @Override
    public Cone orderCone(Flavor[] a) {

        Cone c = new Cone(a) ;
        totalProfit += getProfit();

        return c ;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket i = new IceRocket();
        totalProfit += getProfit();

        return i;
    }

    @Override
    public Magnum orderMagnum(MagnumType b) {
        Magnum m = new Magnum();
        totalProfit += getProfit();
        return m;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

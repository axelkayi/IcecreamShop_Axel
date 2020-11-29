package be.intecbrussel.application.Axel;

import be.intecbrussel.eatable.Axel.Eatable;
import be.intecbrussel.eatable.Axel.PriceList;
import be.intecbrussel.sellers.Axel.IceCreamCar;

import java.util.ArrayList;
import java.util.List;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        List<Integer> pricelist = new ArrayList<>();
        pricelist.add(1);
        pricelist.add(4);
        pricelist.add(6);

        Stock s = new Stock();
        PriceList p = new PriceList();

        IceCreamCar a = new IceCreamCar(p,s);
        a.orderCone(Flavor.values());
        List<Eatable> eatables = new ArrayList<>();
        eatables.add((Eatable)a);
        ((Eatable) a).eat();

        for(Eatable b: eatables){
            System.out.println(b.toString());

        }
        System.out.println(a.getProfit());


    }
}


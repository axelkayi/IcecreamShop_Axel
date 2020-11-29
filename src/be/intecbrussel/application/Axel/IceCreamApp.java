package be.intecbrussel.application.Axel;

import be.intecbrussel.eatable.Axel.Eatable;

import java.util.ArrayList;
import java.util.List;

public class IceCreamApp {
    public static void main(String[] args) {
        List<Integer> pricelist = new ArrayList<>();
        pricelist.add(1);
        pricelist.add(4);
        pricelist.add(6);
        IceCreamSalon a = new IceCreamSalon();
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

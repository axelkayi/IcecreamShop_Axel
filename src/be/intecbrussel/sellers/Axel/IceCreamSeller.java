package be.intecbrussel.sellers.Axel;

import be.intecbrussel.eatable.Axel.Cone;
import be.intecbrussel.eatable.Axel.IceRocket;
import be.intecbrussel.eatable.Axel.Magnum;
import be.intecbrussel.sellers.Axel.Profitable;

public interface IceCreamSeller extends Profitable {
    int price = 0;
    Cone orderCone(Flavor[] a) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(MagnumType b) throws NoMoreIceCreamException;
}

package be.intecbrussel.eatable.Axel;

import be.intecbrussel.eatable.Axel.Eatable;

public class Cone<Flavor> implements Eatable {
    //private final Object Flavor;
    private Flavor[] balls;

    public Cone(){

    }

    public Cone(Flavor[] a){
       this.balls = a;



    }

    @Override
    public void eat() {
        System.out.println("you are eating" + balls);
    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE,
    }

}

package be.intecbrussel.eatable.Axel;

import be.intecbrussel.eatable.Axel.Eatable;

public class Magnum implements Eatable {

    //private final Object MagnumType;
    private MagnumType type;

    public Magnum(){};


    public Magnum(MagnumType a) {
        this.type = a;
    }

    @Override
    public void eat() {
        System.out.println("you are eating" + type);

    }

    public MagnumType getType(){
        return  (MagnumType) type;
    }

    public enum MagnumType {

        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        AlPINENUTS,
        ROMANTICSTRAWBERRIES,




    }
}

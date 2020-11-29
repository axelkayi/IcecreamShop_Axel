package be.intecbrussel.eatable.Axel;

import be.intecbrussel.eatable.Axel.Eatable;

public class IceRocket implements Eatable {
    public IceRocket(){

    }

    @Override
    public void eat() {
        System.out.println("you are eating a rocket ice cream");
    }
}

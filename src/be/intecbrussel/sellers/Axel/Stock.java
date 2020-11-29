package be.intecbrussel.sellers.Axel;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    public int getCones() throws NoMoreIceCreamException {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() throws NoMoreIceCreamException {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() throws NoMoreIceCreamException {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }

    public int getIceRockets() throws NoMoreIceCreamException {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }
}

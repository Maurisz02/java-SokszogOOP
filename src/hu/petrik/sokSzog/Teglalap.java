package hu.petrik.sokSzog;

public class Teglalap extends Sokszog{
    private double b;

    public Teglalap(double a,double b){
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet(){
        return 2 * (super.getA() + this.b);
    }

    public double getTerulet(){
        return super.getA()* this.b;
    }
}

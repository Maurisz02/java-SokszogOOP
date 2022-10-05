package hu.petrik.sokSzog;

public class Teglalap extends Sokszog{
    private double b;

    public Teglalap(double a,double b){
        super(a);
        this.b = b;
    }

    public Teglalap(){
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
    }
    private static double getVeletlenOldal() {
        return Math.random() * 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet(){
        return 2 * (super.getA() + this.b);
    }

    @Override
    public double getTerulet(){
        return super.getA()* this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap:\na = %-10.3f\nb = %-10.3f\n%s",this.getA(),this.getB(),super.toString());
    }
}

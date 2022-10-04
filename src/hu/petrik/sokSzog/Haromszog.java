package hu.petrik.sokSzog;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    Haromszog(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private boolean isSzerkesztheto(){
        boolean isSz = true;
        if((this.getA() + this.b) <= this.getC()
                || (this.getA()+this.getC()) <= this.getB()
                || (this.getB()+this.getC())<=this.getA()){
            isSz = false;
        }
        return isSz;
    }

    public double getKerulet(){
        return super.getA() + this.getB() + this.getC();
    }

    private double getS(){
        return getKerulet() / 2;
    }

    public double getTerulet(){
        return Math.sqrt(this.getS()*(this.getS()-this.getA())* (this.getS()-this.getB()) * (this.getS()-this.getC()));
    }



    @Override
    public String toString() {
        return "Haromszog{}";
    }
}

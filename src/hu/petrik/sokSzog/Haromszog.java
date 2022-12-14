package hu.petrik.sokSzog;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(){
        super(getVeletlenOldal());
        this.b =getVeletlenOldal();
        this.c =getVeletlenOldal();

        while(!isSzerkesztheto()){
            super.setA(getVeletlenOldal());
            this.b = getVeletlenOldal();
            this.c = getVeletlenOldal();
        }
    }


    private static double getVeletlenOldal() {
        return Math.random() * 10 + 5;
    }

    Haromszog(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető!");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető!");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető!");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if(!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető!");
        }
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
        //TODO: toString bef
        return String.format("Háromszög:\na = %-10.3f\nb = %-10.3f\nc = %-10.3f\n%s", this.getA(),this.getB(),this.getC(),super.toString());
    }
}

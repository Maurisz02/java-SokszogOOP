package hu.petrik.sokSzog;

public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i < 5; i++){
            Haromszog h = new Haromszog();
            System.out.println(h+"\n");
        }

        for(int i = 0; i < 5; i++){
            double a = Math.random() *10 +5;
            double b = Math.random() *10 +5;
            System.out.println(new Teglalap(a,b)+"\n");
        }
    }
}

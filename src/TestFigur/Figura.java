package TestFigur;

public abstract class Figura implements Obliczenie,Comparable<Figura> {
    int a;
    int b;
    int number;
    static int ID = 0;


    public Figura(int a, int b) {
        this.a = a;
        this.b = b;
        number = ID++;
    }

    abstract String getNazwa();

    abstract void pozycja(int x, int y);

    @Override
    public int compareTo(Figura o) {
        if(this.pole() - o.pole() < 0) {return -1;}
        if(this.pole() - o.pole() > 0) {return 1;}
        if(this.obwod()- o.obwod()< 0){return -1;}
        if(this.obwod() - o.obwod() > 0 ){return 1;}
        if(this.number < o.number){return -1;}
        if(this.number>o.number){return 1;}

        return 0;
    }

    public String toString() {
        return "(" + a + "," + b + ")";

    }


}

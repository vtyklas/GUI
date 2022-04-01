package TestFigur;

public class Prostokat2 extends Prostokat implements Rysowanie{
    char czymRysujemy;
    public Prostokat2(int a,int b, int szerokosc, int wysokosc,char czymRysujemy){
        super(a,b,szerokosc,wysokosc);
        this.czymRysujemy = czymRysujemy;
    }

    @Override
    public void rysuj() {
        for (int i = super.b-wysokosc; i < b; i++) {
            for (int j = super.a+szerokosc; j > a ; j--) {
                System.out.print(czymRysujemy);
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}

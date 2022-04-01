package TestFigur;

public class Prostokat extends Figura implements Obliczenie{
    int szerokosc;
    int wysokosc;
    public Prostokat(int a,int b,int szerokosc, int wysokosc ){
        super(a,b);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;



    }

    @Override
    String getNazwa() {
        return "Prostokąt";
    }

    @Override
    void pozycja(int x, int y) {

        if(x>=a&&x<=super.a+szerokosc && y<=b && y>=super.b-wysokosc){
            System.out.println("Punkt" + "(" + x + "," + y + ") znajduje się wewnątrz prostokąta");
        }else System.out.println("Punkt" + "(" + x + "," + y + ") znajduje się na zewnątrz prostokąta\n");
    }

    @Override
    public String toString() {
        return getNazwa() +"\n"+
                "Lewy górny - "+super.toString()+"\n"+
                "Szerokość: "+szerokosc+", "+"Wysokość: "+wysokosc +"\n";
//                "Pole - " +pole()+"\n" +
//                "Obwód - "+obwod()+"\n";
    }

    @Override
    public double pole() {
        return szerokosc*wysokosc;
    }

    @Override
    public double obwod() {
        return 2*(szerokosc+wysokosc);
    }



}

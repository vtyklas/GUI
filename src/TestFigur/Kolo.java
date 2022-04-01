package TestFigur;

public class Kolo extends Figura implements Obliczenie {
    int promien;
    final double PI = 3.14;


    public Kolo(int a, int b, int promien) {
        super(a, b);
        this.promien = promien;
    }

    @Override
    String getNazwa() {
        return "Koło";
    }

    @Override
    void pozycja(int x, int y) {
        int rownanieOkregu = (int) (Math.pow((x - a), 2) + Math.pow((y - b), 2));
        if (rownanieOkregu <= (int) (Math.pow(promien, 2))) {
            System.out.println("Punkt" + "(" + x + "," + y + ") znajduje się wewnątrz koła");
        } else System.out.println("Punkt" + "(" + x + "," + y + ") nie znajduje się wewnątrz koła");
    }


    @Override
    public String toString() {
        return getNazwa() + "\n" +
                "Środek - " + super.toString() + "\n" +
                "Promień - " + promien + "\n";
//                "Pole - " +pole()+"\n" +
//                "Obwód - "+obwod()+"\n";
    }

    @Override
    public double pole() {
        return PI * Math.pow(promien, 2);
    }

    @Override
    public double obwod() {
        return 2 * PI * promien;
    }


}

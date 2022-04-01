package TestFigur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFigur {

    public static void main(String[] args)
    {
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(10, 10, 5);                    // położenie koła = srodek = (10,10), promień = 5
        fig[1] = new Prostokat(20, 20, 15, 10);    // położenie prostokąta = lewy górny wierzchołek = (20,20), szerokość = 15, wysokość = 10

        // polimorficzne wywołanie metody toString() z klas Kolo/Prostokat,
        // a nie z klasy Figura
        for (Figura f : fig)              // pętla for-each
            System.out.println(f);    // System.out.println(f.toString());

        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);

//        System.out.println(fig[0].pole());
//        System.out.println(fig[0].obwod());
//        System.out.println(fig[1].pole());
//        System.out.println(fig[1].obwod());

        Figura p2 = new Prostokat2(20,20,10,5,'*');
        ((Prostokat2)p2).rysuj();
//        p2.rysuj(); blad poniewaz nie ma abstrakcyjnej metody rysuj w klasie figura nie implementuje interfejsu rysowanie a jezeli by
//        byla to musialy by wszystkie klasy dziedziczace tez ja miec. Dlatego uzyte jest rzutowanie na klase prostokat2 ktora impelemntuje interfejs rysowanie
//        oraz nie zmusza do implementacji we wszytkich klasach dziedziczacych figure.

        Kolo2 k2 = new Kolo2(15, 20, 5);

        k2.przesunDo(50, 40);    // przesunięcie środka koła do punktu (50, 40)
        System.out.println(k2);

        k2.powrot();                    // powrót do poprzedniej pozycji (bezpośrednio przed przesunięciem) środka koła
        System.out.println(k2);

        List<Figura> listFig = new ArrayList<Figura>();

        Figura a = new Prostokat(1,1,4,9);
        Figura b = new Kolo(1,1,5);
        Figura c = new Prostokat(2,2,6,6);
//        Figura d = new Kolo(2,3,6);
//        Figura e = new Kolo(2,3,6);

        listFig.add(a);
        listFig.add(b);
        listFig.add(c);
//        listFig.add(d);
//        listFig.add(e);

        System.out.println("Figury przed sortowaniem:\n");

        for(Figura f : listFig){
            System.out.println(f);
        }

        Collections.sort(listFig);
        System.out.println("Figury po sortowaniu:\n");

        for(Figura f : listFig){
            System.out.println(f);
        }


    }


}

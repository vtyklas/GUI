package Spiewak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Spiewak s1 = new Spiewak("Dietrich") {
            @Override
            String spiewaj() {return "oooooooooo";}
        };

        Spiewak s2 = new Spiewak("Piaf") {
            @Override
            String spiewaj() {
                return "a4iBBiii";
            }
        };

        Spiewak s3 = new Spiewak("Adele") {
            @Override
            String spiewaj() {
                return "aAa";
            }
        };

        Spiewak sp[] = {s1, s2, s3};

        for (Spiewak s : sp)
            System.out.println(s);

        System.out.println("\n" + Spiewak.najglosniej(sp));

        System.out.println();

        List<Spiewak> listSpiewakow = new ArrayList<Spiewak>();


        Spiewak s6 = new Spiewak("Carrey") {
            @Override
            String spiewaj() {
                return "xyzt123";
            }
        };
        Spiewak s7 = new Spiewak("Houston") {
            @Override
            String spiewaj() {
                return "aabbccddefgh";
            }
        };
        Spiewak s4 = new Spiewak("Darrey") {
            @Override
            String spiewaj() {
                return "eeae";
            }
        };

        Spiewak s8 = new Spiewak("Darrey") {
            @Override
            String spiewaj() {
                return "bebe";
            }
        };

        Spiewak s5 = new Spiewak("Madonna") {
            @Override
            String spiewaj() {
                return "aAa";
            }
        };
        listSpiewakow.add(s4);
        listSpiewakow.add(s5);
        listSpiewakow.add(s6);
        listSpiewakow.add(s7);
        listSpiewakow.add(s8);

        System.out.println("Przed sortowaniem:\n");
        for (Spiewak s : listSpiewakow)
            System.out.println(s);

        System.out.println();

        Collections.sort(listSpiewakow);

        for (Spiewak s : listSpiewakow)
            System.out.println(s);

    }
}

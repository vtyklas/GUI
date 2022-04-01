package Spiewak;

import java.util.Arrays;

abstract class Spiewak implements Comparable<Spiewak> {
    String surname;
    int startNumber;
    static int ID = 1;
    int loudValue;

    public Spiewak(String surname) {
        this.surname = surname;
        this.startNumber = ID;
        ID++;

    }

    @Override
    public int compareTo(Spiewak o) {
        if (this.spiewaj().length() - o.spiewaj().length() < 0) {
            return 1;
        }
        if (this.spiewaj().length() - o.spiewaj().length() > 0) {
            return -1;
        }
        if (this.spiewaj().length() - o.spiewaj().length() == 0) {
            int surnameVal = this.surname.compareTo(o.surname);
            if (surnameVal < 0) {
                return 1;
            } else if (surnameVal > 0) {
                return -1;
            } else if (surnameVal == 0) {
                if (this.startNumber - o.startNumber < 0) {
                    return -1;
                } else if (this.startNumber - o.startNumber > 0) {
                    return 1;
                }
            }

        }

        return 0;

    }

    abstract String spiewaj();


    @Override
    public String toString() {
        return "(" + startNumber + ") " + surname + ": " + spiewaj();

    }

    public static Spiewak najglosniej(Spiewak[] o) {

        for (int i = 0; i < o.length; i++) {
            char[] stringToChar = new char[o[i].spiewaj().length()];
            stringToChar = o[i].spiewaj().toCharArray();
            Arrays.sort(stringToChar);

            o[i].loudValue = stringToChar[stringToChar.length - 1] - stringToChar[0];

        }
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length - 1 - i; j++) {
                if (o[j].loudValue < o[j + 1].loudValue) {
                    Spiewak temp;
                    temp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                }

            }
        }

        return o[0];

    }


}







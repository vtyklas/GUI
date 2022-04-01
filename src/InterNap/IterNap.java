package InterNap;

import java.util.Iterator;

public class IterNap implements Iterable<Character> {
    String napis;
    int start;
    int end;
    int step;

    public IterNap(String napis) {
        this.start = 0;
        this.end = napis.length();
        this.napis = napis;
        this.step = 1;
    }

    public void ustawPoczatek(int start) {
        this.start = start;
    }

    public void ustawKrok(int step) {
        this.step = step;
    }

    @Override
    public Iterator<Character> iterator() {

        return new Iterator<>() {

            int obecnyIndeks = start;

            @Override
            public boolean hasNext() {
                return obecnyIndeks < end;
            }

            @Override
            public Character next() {
                Character ten_znak = napis.charAt(obecnyIndeks);
                obecnyIndeks += step;
                return ten_znak;
            }
        };
    }
}

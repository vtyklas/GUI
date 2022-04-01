package FlySpeakTest;

public class FlySpeakTest {

    public static void main(String[] args) {

        Flyable f[] = { new Bird("GruGru", 10, "Skrzydla", "Goląb"),
                new Virus(150, "Powietrze", "Ebola"),
                new Plane("WRUUUUUUU", 1500, "Silnik odrzutowy", "Boeing 737"),
                new UFO(200000, "silnik", "Gwiazda smierci")
        };

        Speakable s[] = { new Bird("cwierk", 10, "Skrzydla", "Wrobel"),
                new Plane("SIU", 500, "Silnik odrzutowy", "F16"),
                new Plane("BZIUUUUUmmmmm", 1000, "Silnik odrzutowy", "MIG")
        };

        System.out.println("-----Najkrotszy dystans może przebyć-----");
        System.out.println(shortest(f));
        System.out.println("\n-----Najglosniejszy-----");
        System.out.println(loudest(s));

    }

    private static Flyable shortest(Flyable[] f) {

        for (int i = 0; i < f.length; i++) {

            for (int j = 0; j < f.length - 1 - i; j++) {

                if (f[j].distance() > f[j + 1].distance()) {
                    Flyable tmp;
                    tmp = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = tmp;

                }
            }

        }
        return f[0];
    }

    private static Speakable loudest(Speakable[] s) {

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].speak().length() < s[j + 1].speak().length()) {

                    Speakable tmp;
                    tmp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tmp;

                }
            }

        }
        return s[0];

    }











}


package FlySpeakTest;

public class Bird implements Flyable, Speakable{
    String odglos;
    double distance;
    String naped;
    String nazwa;

    public Bird(String odglos, double distance, String naped, String nazwa) {
        this.odglos = odglos;
        this.distance = distance;
        this.naped = naped;
        this.nazwa = nazwa;
    }

    @Override
    public String speak() {

        return this.odglos;
    }

    @Override
    public double distance() {

        return this.distance;
    }

    @Override
    public String drive() {

        return this.naped;
    }


    @Override
    public String toString(){
        return this.nazwa + "\n" + this.distance+ "\n" + this.odglos;
    }


}

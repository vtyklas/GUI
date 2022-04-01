package FlySpeakTest;

public class UFO implements Flyable{
    String odglos;
    double distance;
    String naped;
    String nazwa;

    public UFO(double distance, String naped, String nazwa) {

        this.distance = distance;
        this.naped = naped;
        this.nazwa = nazwa;
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

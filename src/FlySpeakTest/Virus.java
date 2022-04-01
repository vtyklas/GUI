package FlySpeakTest;

public
class Virus implements Flyable {

    double distance;
    String naped;
    String nazwa;

    public Virus(double distance, String naped, String nazwa) {

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
        return this.nazwa + "\n" + this.distance+ "\n";
    }


}
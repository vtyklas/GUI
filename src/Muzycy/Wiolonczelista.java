package Muzycy;

public class Wiolonczelista extends Muzyk {

    public Wiolonczelista(String imie,double czas){
        super(imie, czas);
        instrument();
    }
    @Override
    public String instrument(){
        return "Wiolonczela";
    }
    @Override
    public int stawka(){
        return 250;
    }
    @Override
    public String toString(){
        return super.toString()+ " stawka= " + stawka();
    }


}

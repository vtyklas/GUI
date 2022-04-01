package Muzycy;

public class Flecista extends Muzyk {

    public Flecista(String imie,double czas){
        super(imie, czas);
        instrument();
        stawka();
    }
    @Override
    public String instrument(){
        return "Flet";
    }
    @Override
    public int stawka(){
        return 300;
    }
    @Override
    public String toString(){
        return super.toString()+ " stawka= " + stawka();
    }

}

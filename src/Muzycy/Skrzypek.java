package Muzycy;

public class Skrzypek extends Muzyk {
    public Skrzypek(String imie,double czas){
        super(imie, czas);
        instrument();
        stawka();
    }
    @Override
    public String instrument(){
        return "Skrzypce";
    }
    @Override
    public int stawka(){
        return 200;
    }
    @Override
    public String toString(){
        return super.toString()+ " stawka= " + stawka();
    }


}

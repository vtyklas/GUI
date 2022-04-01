package Muzycy;

import java.util.Arrays;

abstract class Muzyk implements Comparable {
    private String imie;
    private double czas;

    protected Muzyk(String imie,double czas){
        this.imie = imie;
        this.czas = czas;

    }

    public String imie(){
        return this.imie;
    }

    public double czas(){
        return this.czas;
    }

    abstract protected String instrument();
    abstract protected int stawka();

    public String toString(){
        return  this.imie +" "+ "Czas występu - " + this.czas;
    }

    public int compareTo(Object o){
        Muzyk muz = (Muzyk) o;
        return (int) (-1*((this.stawka()*this.czas()- muz.stawka()* muz.czas())));
    }
    public static Muzyk maxHonorarium(Muzyk[] muzycy){

        return muzycy[0];


        }
    }


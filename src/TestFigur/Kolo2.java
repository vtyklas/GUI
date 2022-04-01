package TestFigur;

public class Kolo2 extends Kolo implements Transformacja{
    int copya;
    int copyb;

    public Kolo2(int a,int b,int promien){
        super(a,b, promien);
    }

    @Override
    public void przesunDo(int x, int y) {

        copya = this.a;
        copyb = this.b;
        this.a = x;
        this.b = y;
    }

    @Override
    public void powrot() {

        this.a = copya;
        this.b = copyb;
    }
}

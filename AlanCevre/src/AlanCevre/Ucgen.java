package AlanCevre;

public class Ucgen extends Sekil{
    private int k;
    private int h;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    @Override
    public int alan(){ 
        return (k*h)/2;
      
    }

    @Override
    public int cevre(){
        return k*3;
      
    }
}

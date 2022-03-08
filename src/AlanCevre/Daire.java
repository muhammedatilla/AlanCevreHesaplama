package AlanCevre;

public class Daire extends Sekil{
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    } 

    @Override
    public int alan(){ 
        return (int) (Math.PI*r*r);
      
    }

    @Override
    public int cevre(){
        return (int) (Math.PI*2*r);
      
    }
}

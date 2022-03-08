
package AlanCevre;

public class Dikdortgen extends Sekil{
    private int k1;
    private int k2;

    public int getK1() {
        return k1;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public int getK2() {
        return k2;
    }

    public void setK2(int k2) {
        this.k2 = k2;
    }

    @Override
    public int alan(){ 
        return k1*k2;
      
    }

    @Override
    public int cevre(){
        return 2*(k1+k2);
      
    }
}

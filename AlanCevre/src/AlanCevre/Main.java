package AlanCevre;

public class Main {

    public static void main(String[] args) {

        Dikdortgen dk = new Dikdortgen();
        dk.setK1(2);
        dk.setK2(4);
        System.out.println("Dikdörtgenin Çevresi: "+dk.cevre());
        System.out.println("Dikdörtgenin Alanı: "+dk.alan());
        
        Ucgen u = new Ucgen();
        u.setK(4);
        u.setH(5);
        System.out.println("Üçgenin Çevresi: "+u.cevre());
        System.out.println("Üçgenin Alanı: "+u.alan());
        
        Daire d = new Daire();
        d.setR(5);
        System.out.println("Dairenin Alanı : "+ d.alan());
        System.out.println("Dairenin Çevresi "+ d.cevre());

    }

}

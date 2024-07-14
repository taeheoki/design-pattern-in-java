package shop.taeheoki.designpatterns._02_structural_patterns._07_bridge._01_before;

public class KDA카이사 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 카이사 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 카이사 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 카이사 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 카이사 R");
    }
}

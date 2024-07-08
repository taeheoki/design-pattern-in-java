package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}

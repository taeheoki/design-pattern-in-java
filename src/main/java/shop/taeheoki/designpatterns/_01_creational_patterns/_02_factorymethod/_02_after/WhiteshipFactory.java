package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after.ShipPartsFactory;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}

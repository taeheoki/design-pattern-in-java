package shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.DefaultShipFactory;
import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Ship;
import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}

package shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Ship;
import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}

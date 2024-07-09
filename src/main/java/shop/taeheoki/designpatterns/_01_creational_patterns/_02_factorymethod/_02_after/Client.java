package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after.WhiteshipPartsProFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(new WhiteshipPartsProFactory()), "whiteship", "taeheoki@poscodx.com");
        client.print(new BlackshipFactory(), "blackship", "taeheoki@poscodx.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}

package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._01_befor;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "taeheoki@poscodx.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "taeheoki@poscodx.com");
        System.out.println(blackship);
    }
}

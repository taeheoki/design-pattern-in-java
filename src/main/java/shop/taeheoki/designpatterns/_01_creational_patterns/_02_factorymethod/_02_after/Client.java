package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "taeheoki@poscodx.com");
        client.print(new BlackshipFactory(), "blackship", "taeheoki@poscodx.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}

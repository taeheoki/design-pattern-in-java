//package shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._03_java;
//
//import org.springframework.beans.factory.FactoryBean;
//import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._01_befor.Ship;
//import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Whiteship;
//
//public class ShipFactory implements FactoryBean<Ship> {
//    @Override
//    public Ship getObject() throws Exception {
//        Ship ship = new Whiteship();
//        ship.setName("whiteship");
//        return null;
//    }
//
//    @Override
//    public Class<?> getObjectType() {
//        return Ship.class;
//    }
//}

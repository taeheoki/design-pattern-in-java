package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._03_java;

import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Blackship;
import shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after.Whiteship;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }
        throw new IllegalArgumentException();
    }
}

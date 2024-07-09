package shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}

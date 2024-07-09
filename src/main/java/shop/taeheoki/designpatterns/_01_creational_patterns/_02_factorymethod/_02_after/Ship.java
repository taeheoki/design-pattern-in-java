package shop.taeheoki.designpatterns._01_creational_patterns._02_factorymethod._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Anchor;
import shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Wheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private String wheel;

    private String anchor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public void setAnchor(Anchor anchor) {

    }

    public void setWheel(Wheel wheel) {

    }
}

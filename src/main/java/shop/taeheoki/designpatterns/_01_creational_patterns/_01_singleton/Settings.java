package shop.taeheoki.designpatterns._01_creational_patterns._01_singleton;

public enum Settings {
    INSTANCE;

    Settings() {}

    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }
}

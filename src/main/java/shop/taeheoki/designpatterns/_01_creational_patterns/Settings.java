package shop.taeheoki.designpatterns._01_creational_patterns;

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

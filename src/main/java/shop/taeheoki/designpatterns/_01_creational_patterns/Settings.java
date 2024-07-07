package shop.taeheoki.designpatterns._01_creational_patterns;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() { // 역질렬화시 사용되는 메서드
        return getInstance();
    }
}

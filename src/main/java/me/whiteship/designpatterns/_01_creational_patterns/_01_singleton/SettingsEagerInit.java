package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.util.Objects;

public class SettingsEagerInit {
    private static SettingsEagerInit instance;
    private final String name;

    static {
        try {
            instance = new SettingsEagerInit("not throw");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private SettingsEagerInit(String name) throws Exception {
        if(Objects.equals(name, "throw")) {
            throw new Exception();
        }
        this.name = name;
    }
    
    public static SettingsEagerInit getInstance() {
        return instance;
    }

    public String getName() {
     return this.name;
    }
}

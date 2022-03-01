package com.zyt.creation.afactory;

public class FactoryProducer {
    public enum OS {
        MAC, WINDOWS
    }

    public static GUIFactory getFactory(OS os) {
        switch (os) {
            case MAC:
                return new MacFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}

package com.zyt.creation.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("red", new RedColor());
    }

    public static Color getColor(String color) throws CloneNotSupportedException {
        return (Color) colorMap.get(color).clone();
    }
}

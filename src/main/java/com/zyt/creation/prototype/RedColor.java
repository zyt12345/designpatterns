package com.zyt.creation.prototype;

public class RedColor extends Color {

    public RedColor() {
        colorName = "Red";
    }

    @Override
    public void addColor() {
        System.out.println("Red color add");
    }
}

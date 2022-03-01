package com.zyt.creation.prototype;

public class BlueColor extends Color {

    public BlueColor() {
        colorName = "Blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue color add");
    }
}

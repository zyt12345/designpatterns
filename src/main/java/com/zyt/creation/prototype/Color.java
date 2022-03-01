package com.zyt.creation.prototype;

public abstract class Color implements Cloneable {

    protected String colorName;

    public abstract void addColor();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}

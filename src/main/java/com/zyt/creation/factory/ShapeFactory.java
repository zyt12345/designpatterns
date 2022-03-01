package com.zyt.creation.factory;

public class ShapeFactory {

    public enum ShapeType {
        SQUARE, CIRCLE
    }

    public Shape getShap(ShapeType type) {
        switch (type) {
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            default:
                return null;
        }
    }
}

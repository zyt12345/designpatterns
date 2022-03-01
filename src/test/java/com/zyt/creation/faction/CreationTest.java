package com.zyt.creation.faction;

import com.zyt.creation.afactory.FactoryProducer;
import com.zyt.creation.afactory.GUIFactory;
import com.zyt.creation.factory.Shape;
import com.zyt.creation.factory.ShapeFactory;
import com.zyt.creation.prototype.ColorStore;
import org.junit.Test;

public class CreationTest {
    @Test
    public void testFactory() {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShap(ShapeFactory.ShapeType.SQUARE);
        shape1.draw();

        Shape shape2 = factory.getShap(ShapeFactory.ShapeType.CIRCLE);
        shape2.draw();
    }

    @Test
    public void testAFactory() {
        GUIFactory factory = FactoryProducer.getFactory(FactoryProducer.OS.WINDOWS);
        factory.createBtn().paint();
        factory.createCheckBox().paint();
    }

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("blue").addColor();
    }
}

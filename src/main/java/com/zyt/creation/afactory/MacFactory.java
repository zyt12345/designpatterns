package com.zyt.creation.afactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createBtn() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

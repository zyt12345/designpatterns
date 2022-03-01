package com.zyt.creation.afactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createBtn() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}

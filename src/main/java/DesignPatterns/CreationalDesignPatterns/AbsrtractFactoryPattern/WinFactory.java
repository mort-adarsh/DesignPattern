package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.Button;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.WinButton;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.Checkbox;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.WinCheckbox;


class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
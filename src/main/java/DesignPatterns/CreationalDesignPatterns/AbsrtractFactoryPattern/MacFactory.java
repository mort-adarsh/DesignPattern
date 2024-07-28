package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.MacButton;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.Button;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.Checkbox;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.MacCheckbox;

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
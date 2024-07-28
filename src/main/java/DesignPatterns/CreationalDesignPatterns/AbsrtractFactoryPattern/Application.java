package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.Button;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.Checkbox;

class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
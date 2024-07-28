package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;


import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox.Checkbox;
import DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button.Button;

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a MacOS style.");
    }
}

package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.CheckBox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}

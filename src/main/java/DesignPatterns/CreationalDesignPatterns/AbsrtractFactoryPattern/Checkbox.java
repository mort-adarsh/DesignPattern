package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

interface Checkbox {
    void paint();
}

class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in a MacOS style.");
    }
}
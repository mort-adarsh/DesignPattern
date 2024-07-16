package DesignPatterns.StructuralDesignPattern.FlyWeightDesignPattern;

public class Letter implements CharInterface{
    private final Character character;
    private final int size;
    private final String fontFamily;

    public Letter(Character character, int size, String fontFamily) {
        this.character = character;
        this.size = size;
        this.fontFamily = fontFamily;
    }

    public Character getCharacter() {
        return character;
    }

    public int getSize() {
        return size;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    // Setters are not allowed as we need to keep this class instances immutable.

    // Display method
    @Override
    public void display(int xAxis,int yAxis){
        System.out.println(">> Character: "+character+" visible on "+xAxis +" x-axis and "+ yAxis+" y-axis");
    }

}

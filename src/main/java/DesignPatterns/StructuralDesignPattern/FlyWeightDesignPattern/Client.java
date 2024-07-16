package DesignPatterns.StructuralDesignPattern.FlyWeightDesignPattern;

public class Client {

    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactory();
        Letter a1 = factory.getLetter('a');
        a1.display(1,0);

        Letter a2 = factory.getLetter('a');
        a2.display(10,20);

        Letter b1 = factory.getLetter('b');
        b1.display(1,0);

        Letter b2 = factory.getLetter('b');
        b2.display(10,20);

        Letter a3 = factory.getLetter('a');
        a3.display(1,20);

    }
}

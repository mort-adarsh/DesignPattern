package DesignPatterns.StructuralDesignPattern.FlyWeightDesignPattern;

import java.util.HashMap;

public class CharacterFactory {

    private static HashMap<Character, Letter> letterHashMap = new HashMap<>();

    public Letter getLetter(Character letter){
        if(letterHashMap.containsKey(letter)) {
            System.out.println(letter +" - already present");
            return letterHashMap.get(letter);
        }
        else{
            System.out.println(letter +" - not present, creating new");
            Letter letterObj = new Letter(letter,10,"Arial");
            letterHashMap.put(letter,letterObj);
            return letterObj;
        }
    }

}

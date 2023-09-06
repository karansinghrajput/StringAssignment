//4.Write a java program to remove a particular character from a String.

package com.karan.main;

class removes{
    public static String removeCharacter(String str, char charToRemove)
    {
        return str.replaceAll(Character.toString(charToRemove),"");
    }
}

public class RemoveParticularChar {
    public static void main(String[] args) {

        String input = "Hello World!";
        char charToRemove = 'H';

        String output = removes.removeCharacter(input,charToRemove);
        System.out.println("Original String: "+input);
        System.out.println("After remove ' "+ charToRemove + "' : " +output);

    }
}

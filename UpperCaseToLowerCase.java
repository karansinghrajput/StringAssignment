
//3.Write a java program to convert upper case to lower case and vice versa.

package com.karan.main;

class Problem{

    public static String converter(String str)
    {
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++)
        {
           char c =  chars[i];

           if(Character.isUpperCase(c))
           {
               chars[i] = Character.toLowerCase(c);
           }
           else if(Character.isLowerCase(c))
           {
               chars[i] = Character.toUpperCase(c);
           }
        }
        return new String(chars);
    }

}


public class UpperCaseToLowerCase {
    public static void main(String[] args) {

        String input = "Hello, WoRLd!";
        String output = Problem.converter(input);

        System.out.println("Original String: " +input);
        System.out.println("Toggled String : " + output);
    }
}


//1.Write a java program to Reverse a string without using the inbuilt method.

package com.karan.main;

class ReverseGenerate{

    public static String generates(String str)
    {
        char [] chars = str.toCharArray();

        int left = 0;
        int right = chars.length-1;

        char temp;
        while(left < right)
        {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

public class ReverseString {

    public static void main(String[] args) {
        String str = "karan sing";
        String result = ReverseGenerate.generates(str);

        System.out.println("Original String: "+ str);
        System.out.println("After Reversing: "+ result);
    }
}


//2.Write a java program to know whether the given string is palindrome

package com.karan.main;
class Check{
    // This method is used to reverse a sting.
    public static String reverseString(String str)
    {
       char[] chars = str.toCharArray();
       int left = 0;
       int right = chars.length-1;
       char temp;
         while(left < right)
         {
             //Swap Character Array.
             temp = chars[left];
             chars[left] = chars[right];
             chars[right] = temp;

             // moves left and right pointer.
              left ++;
              right--;
         }

        return new String(chars);

    }
}

public class CheckPalindrome {
    public static void main(String[] args) {

        String s = "Racecar";
       String reverse =  Check.reverseString(s);

      int result = s.compareToIgnoreCase(reverse);

      if(result == 0)
      {
          System.out.println("Both strings are equal.");
      }
      else if(result < 0)
      {
          System.out.println("str1 is lexicographically less than str2.");
      }
      else{
          System.out.println("str1 is lexicographically greater than str2.");
      }
    }
}

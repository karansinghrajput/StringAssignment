
//5.Write a java program to find the index of a substring.

package com.karan.main;
import java.util.Scanner;
public class SubStringIndexFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a String ");
        String mainString = scan.nextLine();

        System.out.println("Please Enter a SubString that you find index");
        String subString = scan.nextLine();

        int index = mainString.indexOf(subString);

        if(index != -1)
        {
            System.out.println("The index of SubString is " + index);
        }
        else{
            System.out.println("SubString is not Founded in the mainString.");
        }

        scan.close();
    }
}

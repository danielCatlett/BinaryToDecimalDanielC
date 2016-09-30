package com.example;
import java.util.Scanner;
import java.util.ArrayList;

public class MyClass
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input binary number to be converted");
        int input=in.nextInt(); //binary number stored as input throughout program
        int length = (int)(Math.log10(input)); //number of digits in inputted number
        findSum(input, length);
    }

    private static void findSum(int input, int length)
    {
        int sum=0; //will be the outputted decimal value
        /*
        The following for loop checks each digit of the inputted binary number.
        If the digit is a 1, than 2^(length-x) is added to the sum.
         */
        for(int x=0; x<=length; x++)
        {
            if(isOdd( (int) (input / (Math.pow(10, (length - x) )))))
                sum += (int) (Math.pow(2, length-x) );
        }
        System.out.println("That number is "+sum+" in decimal");
    }

    private static boolean isOdd(double num)
    {
        if(num%2==0) //if the remainder of num/2 is 0 (aka if the number is even)
            return false;
        else
            return true;
    }
}

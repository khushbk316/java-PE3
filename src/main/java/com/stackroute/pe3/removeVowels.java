package com.stackroute.pe3;

import java.util.Scanner;

public class removeVowels {
    public  static void main(String ar[])
    {

        int i,numberofstring;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter no of string input");
        numberofstring=scanner.nextInt();
        String arr[]=new String[numberofstring];
        System.out.println("enter the string values");
                for (i=0;i<=numberofstring;i++)
            arr[i]=scanner.nextLine();
        System.out.println("Removing the vowels......");
        for(i=0;i<numberofstring;i++)
        {
              arr[i]= arr[i].replaceAll("[AaEeIiOoUu]", "");
              System.out.println(arr[i]);
        }
    }
}

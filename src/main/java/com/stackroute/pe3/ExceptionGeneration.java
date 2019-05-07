package com.stackroute.pe3;

import java.util.Scanner;

public class ExceptionGeneration {
    public static void main(String ar[])
    {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("enter the size of the array...");
            int sizeOfArray=scanner.nextInt();
            if(sizeOfArray<0)
                throw new Exception();
            else
                System.out.println("correct");
        }
        catch (Exception exception) {
            System.out.println("invalid entry");
        }
         //code for arrayindexoutofbound.......

        try{
            int arr[]=new int[3];
             System.out.println("Array size is 3 and we are trying to pring index no 5 value....");
                System.out.println(arr[5]);

        }
        catch (Exception exception)
        {
            System.out.println("invalid entry");
        }

       //code for nullpointerexception.....
        try{
            int arr[]=null;
            if(arr[4]==20);

        }
        catch (Exception exception)
        {
            System.out.println("invalid entry");
        }
    }



}

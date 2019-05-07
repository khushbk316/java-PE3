package com.stackroute.pe3;

import java.util.Scanner;

public class consecutiveNumbers {
    public  static void  main(String ar[])
    {
        int i;
        int flag=0;
        String str;
        System.out.println("enter the string separated by comma.....");
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        String arr[]=str.split(",");
        int length=arr.length;
        int arr1[]=new int[length];
        for(i=0; i<length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);

        }
        for(i=0;i<length-1;i++)
        {
            if(arr1[i]-arr1[i+1]==-1) {
                flag=0;
            }
        else
            flag=1;
            }
        if(flag==0)
            System.out.println("Consecutive");
        else
            System.out.println(" not Consecutive");
    }

}

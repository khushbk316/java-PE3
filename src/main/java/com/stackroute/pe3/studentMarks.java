package com.stackroute.pe3;

import java.util.Scanner;

public class studentMarks {

     public static void main(String ar[])
     {
         int  numOfStudents,i;

         System.out.println("Enter the number of students:");
         Scanner scanner=new Scanner(System.in) ;
         numOfStudents=scanner.nextInt();
         int[] stuArray=new int[numOfStudents];
         System.out.println("enter the grades of each of the students");
         for (i=0;i<numOfStudents;i++)
         {
             stuArray[i]=scanner.nextInt();
             if(stuArray[i]>=0&&stuArray[i]<=100)
                 System.out.println("Grade of "+i+"th student is"+stuArray[i] );
                 else
                     System.out.println("grades are out of range");

         }

     }
}

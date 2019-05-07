package com.stackroute.pe3;

public class chessBoard {

    public  static void main(String ar[])
    {
        String matrix1[][]=new String[9][9];
        int i,j;
        for(i=0;i<9;i++)
        {

            for(j=0;j<9;j++)
            {
                if((i+j)%2==0)
                    matrix1[i][j]="WW";
                else
                    matrix1[i][j]="BB";
            }

        }
        System.out.println("my chess board");
        for(i=0;i<9;i++) {
            System.out.println();
            for (j = 0; j < 9; j++) {
                System.out.print(matrix1[i][j]);

            }

        }


    }


}

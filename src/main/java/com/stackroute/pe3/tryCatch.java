package com.stackroute.pe3;

import java.util.Scanner;

class someException extends Exception {
    public someException(String str)
    {
        super(str);
    }
}
class ExceptionHandling {
    public void checkDivision(int num) throws someException {
        if (num == 0) {
            someException divideByZero = new someException("zero cannot be in denominator");
            throw divideByZero;
        } else
            System.out.println(10/num);

    }

}
public class tryCatch {
    public static void main(String ar[]) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        ExceptionHandling handlingException = new ExceptionHandling();

        try {

            handlingException.checkDivision(number);
        } catch (someException e) {
            System.out.println(e.getMessage());
        }



       finally {
            System.out.println("inside finally");
        }
    }
}
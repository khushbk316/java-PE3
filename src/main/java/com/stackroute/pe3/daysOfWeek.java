package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class daysOfWeek {
    public  static  void main(String ar[])
    {
        Calendar cal = Calendar.getInstance();
        Date thisDate=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yy");
        System.out.println(dateFormat.format(thisDate));

        //System.out.println("Day of Week : " + cal.get(Calendar.DAY_OF_WEEK));
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);


        System.out.println("First day of the week : "+dateFormat.format(cal.getTime()));

        cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        System.out.println("Last day of the week : "+dateFormat.format(cal.getTime()));

    }

}

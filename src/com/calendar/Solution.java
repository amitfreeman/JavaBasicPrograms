package com.calendar;

import java.io.*;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
          String Day=new String();
          Calendar cal=Calendar.getInstance();
          cal.set(year, month, day);
          int DayInt=cal.getTime().getDay();
          
          
          switch(DayInt) {
          case 0: Day="SUNDAY"; break;
          case 1: Day="MONDAY"; break;
          case 2: Day="TUESDAY"; break;
          case 3: Day="WEDNESDAY"; break;
          case 4: Day="THURSDAY"; break;
          case 5: Day="FRIDAY"; break;
          case 6: Day="SATURDAY"; break;
          }
          
    	  return Day;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

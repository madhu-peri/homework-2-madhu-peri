/**
 * Starter code for homework 2 Problem 1 - CIS 2348
 * Name: Madhumitha Periyasamy
 * PS:1595200
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 01;
                break;
            case "February":
                monthInt = 02;
                break;
            case "March":
                monthInt = 03;
                break;
            case "April":
                monthInt = 04;
                break;
            case "May":
                monthInt = 05;
                break;
            case "June":
                monthInt = 06;
                break;
            case "July":
                monthInt = 07;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 00;
        }

        return monthInt;
    }

    public static void main(String[] args) throws IOException {

        Scanner scnr;
        FileInputStream file = new FileInputStream("src\\inputDates.txt");
        scnr = new Scanner(file);
        FileOutputStream output = new FileOutputStream("parsedDates.txt");
        PrintWriter opf = new PrintWriter(output);
        ArrayList<String> dates = new ArrayList<String>();
        String d;
        int i;
        while (true) {
            //System.out.println("Please enter a date: ");
            d = scnr.nextLine();
            if (d.equals("-1")) {
                break;
            }
            dates.add(d);
        }
        for (i = 0; i < dates.size(); i++) {
            try {
                String month = dates.get(i).substring(0, dates.get(i).indexOf(" "));
                String day = dates.get(i).substring(dates.get(i).indexOf(" ") + 1, dates.get(i).indexOf(","));
                String year = dates.get(i).substring(dates.get(i).indexOf(",") + 2, dates.get(i).length());
                opf.println(getMonthAsInt(month) + "/" + day + "/" + year);
            } catch (Exception a) {
            }
        }

        scnr.close();
        opf.close();
    }
}

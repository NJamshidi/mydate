package ir.maktab58;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public  boolean isValidDate(int year,int month,int day){
        Pattern pattern = Pattern.compile("([1-9]{4})/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])");
        String date = year+"/"+month+"/"+day;
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            year = Integer.parseInt(matcher.group(1));
            month = Integer.parseInt(matcher.group(2));
            day = Integer.parseInt(matcher.group(3));
            if (month > 6 && day < 31) {
                return true;
            } else if (month == 12 && day < 29) {

                return true;
            } else if (month<6 && day<=31){
                return true;
            }
        }
        return false;

    }
    public int getmontlastDay(int month){
       if(month<=6){
           return 31;
       }else if(month>6&&month<12){
           return 30;
       }else {
           return 29;
       }
    }
}

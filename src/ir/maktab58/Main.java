package ir.maktab58;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        boolean result = myDate.isValidDate(1399, 12, 28);
        System.out.println(result);
        int lastDay = myDate.getmontlastDay(11);
        System.out.println(lastDay);
    }

}

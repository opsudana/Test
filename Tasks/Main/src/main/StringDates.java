package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDates {

    public static void main(String[] args) {
        String dates = "Тут вот есть дата: 1995/11/05 или вот так, например, 2007/04/02 14:22 файнали 1994/07/14 22:12:33";

        String pattern =  "\\d{4}\\/\\d{1,2}\\/\\d{1,2}( \\d{1,2}\\:\\d{1,2}(:\\d{1,2})?)?";    
        Matcher matcher = Pattern.compile(pattern).matcher(dates);
        

        if (!matcher.find()) {
            System.out.println("Date Not Found!");
            return;
        }
       do{
        String dateString = dates.substring(matcher.start(), matcher.end());     
        System.out.println(dateString );}
        while(matcher.find());
    }
}

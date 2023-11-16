package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XDatee {

    static SimpleDateFormat formater = new SimpleDateFormat();

//        String s = "13-02-2004";
//        Date date = XDate.toDate(s,"dd-MM-yyyy");
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);    
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//        Date now = new Date();
//        String s = XDate.toString(now, "dd-MM-yyyy");
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
//    Date now = new Date();
//    Date after = XDate.addDays(now, 10);
    public static Date addDays(Date date, long days ){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}

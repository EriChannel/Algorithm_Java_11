package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String formatDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = format.format(date);
        return strDate;
    }
}

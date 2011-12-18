package com.kpoint.doumixer.nlp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Collections;
/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 15:07
 * To change this template use File | Settings | File Templates.
 */
public class Time {
    private ArrayList<Integer> days = new ArrayList<Integer>();
    private Date date = null;
    private ArrayList<String> times = new ArrayList<String>();
    
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";


    public boolean equals(Time t) {
        return false;
    }

    private static String now() {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(cal.getTime());

        }

    public void addWord(String word, Token token) {

        switch (token.getType()) {
            case DAY: days.add(Integer.parseInt(token.getProperties()));
                break;
            case NOW: date = Calendar.getInstance().getTime();
                break;
            case TIME: times.add(word); Collections.sort(times);
                break;
        }
    }
    
    public String toString() {
        StringBuilder squery = new StringBuilder();

        int i;
        for(i = 0; (i+1) < times.size(); i+=2) {
            squery.append( "(" + times.get(i) + "<= $TIME AND " +  "$TIME <= " + times.get(i+1) + ") OR ");
        }

        if (i < times.size()) {
            squery.append( "(" + times.get(i) + "<= $TIME)");
        }


        for(Integer day : days) {
            squery.append("($DAY = " + day + ") OR ");
        }
        
        if (date != null) {
            squery.append(" OR ($DATE = " + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date) + ")");
        }

        return squery.toString();
    }

    public boolean isEmpty() {
        if ((days.size() > 0) && (date != null) && (times.size() > 0)) {
            return false;
        }
        else {
            return true;
        }

    }

}

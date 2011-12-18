package com.kpoint.doumixer.nlp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
public class Location {

    private ArrayList<String> regions = new ArrayList<String>();
    private ArrayList<String> streets = new ArrayList<String>();

    public boolean equals(Time t) {
        return false;
    }

    public void addWord(String word, Token token) {
        System.out.println(word + " " + token.getType());

        tokens.put("рядо", new Token("рядо", "рядом", Context.LOCATION, "near", Type.NEAR));
        tokens.put("возл", new Token("возл", "возле", Context.LOCATION, "near", Type.NEAR));
        tokens.put("здесь", new Token("здесь", "здесь", Context.LOCATION, "1", Type.REGION));
        tokens.put("голосе", new Token("голосе", "голосеево", Context.LOCATION, "1", Type.REGION));
        tokens.put("троещ", new Token("троещ", "троещина", Context.LOCATION, "2", Type.REGION));

        switch (token.getType()) {
            case REGION: regions.add(token.getProperties());
                break;
            case STREET: streets.add(token.getProperties());
                break;
            case NEAR:
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
            squery.append(" OR ({DATE}" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date) + ")");
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

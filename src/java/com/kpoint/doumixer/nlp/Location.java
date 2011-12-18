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
public class Location implements SearchQueryData{

    private ArrayList<String> regions = new ArrayList<String>();
    private ArrayList<String> streets = new ArrayList<String>();

    public boolean equals(Location l) {
        return false;
    }

    public void addWord(String word, Token token) {

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

        for(String street : streets) {
            squery.append("($STREET = " + street + ") OR ");
        }

        for(String region : regions) {
            squery.append("($REGION = " + region + ") OR ");
        }

        return squery.toString();
    }

    public boolean isEmpty() {
        if ((regions.size() > 0) && (regions.size() > 0)) {
            return false;
        }
        else {
            return true;
        }

    }
}

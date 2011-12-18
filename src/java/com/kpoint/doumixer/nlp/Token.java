package com.kpoint.doumixer.nlp;


import java.util.Map;
import java.util.HashMap;
/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */


public class Token {
    public enum Context { PRICE, CLASSES, TIME, LOCATION }
    public enum Type { EQUALITY, CURRENCY, PRICE,
                       DAY, DATE, TIME, NOW,
                       NEAR, REGION, STREET,
                       MAINTAG, SECONDARYTAG, NONETAG}
    private String properties = "";
    private String shorttext = "";
    private String fulltext = "";
    private Type type = null;
    private Context context = Context.CLASSES;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public String getShorttext() {
        return shorttext;
    }

    public void setShorttext(String shorttext) {
        this.shorttext = shorttext;
    }



    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public Token(String shorttext, String fulltext, Context context, String properties, Type type) {
        this.shorttext = shorttext;
        this.context = context;
        this.properties = properties;
        this.fulltext = fulltext;
        this.type = type;
    }

    public Token(String shorttext, String fulltext, Context context, String properties) {
        this.shorttext = shorttext;
        this.context = context;
        this.properties = properties;
        this.fulltext = fulltext;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }



    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public static Map <String, Token> initTokens() {
        Map <String, Token> tokens = new HashMap <String, Token>();

        //Price
        tokens.put("мень", new Token("мень", "меньше", Context.PRICE, "<=", Type.EQUALITY));
        tokens.put("мене", new Token("мене", "менее", Context.PRICE, "<=", Type.EQUALITY));
        tokens.put("деш",  new Token("деш", "дешевле", Context.PRICE, "<=", Type.EQUALITY));
        tokens.put("боль", new Token("боль", "больше", Context.PRICE, ">=", Type.EQUALITY));
        tokens.put("доро", new Token("доро", "дороже", Context.PRICE, ">=", Type.EQUALITY));
        tokens.put("до",   new Token("до", "до", Context.PRICE, "<=", Type.EQUALITY));
//        tokens.put("цен", new Token("цен", "цена", Context.PRICE, "", Type.PRICE));
        tokens.put("$price", new Token("$price", "цена", Context.PRICE, "", Type.PRICE));
        tokens.put("грн", new Token("грн", "грн", Context.PRICE, "grn", Type.CURRENCY));
        tokens.put("дол", new Token("дол", "долларов", Context.PRICE, "usd", Type.CURRENCY));
        tokens.put("$", new Token("$", "$", Context.PRICE, "usd", Type.CURRENCY));

        //Time
        tokens.put("пон", new Token("пон", "понедельник", Context.TIME, "0", Type.DAY));
        tokens.put("втор", new Token("втор", "вторник", Context.TIME, "1", Type.DAY));
        tokens.put("сер", new Token("сер", "середа", Context.TIME, "3", Type.DAY));
        tokens.put("чет", new Token("чет", "четвер", Context.TIME, "4",  Type.DAY));
        tokens.put("пятн", new Token("пятн","пятница", Context.TIME, "5",  Type.DAY));
        tokens.put("суб", new Token("суб", "субота", Context.TIME, "6",  Type.DAY));
        tokens.put("воск", new Token("воск", "воскересение", Context.TIME, "7", Type.DAY));

        tokens.put("сей", new Token("сей", "сейчас", Context.TIME, "now", Type.NOW));
        tokens.put("$time", new Token("$time", "time", Context.TIME, "", Type.TIME));



        //Location
        tokens.put("рядо", new Token("рядо", "рядом", Context.LOCATION, "near", Type.NEAR));
        tokens.put("возл", new Token("возл", "возле", Context.LOCATION, "near", Type.NEAR));
        tokens.put("здесь", new Token("здесь", "здесь", Context.LOCATION, "1", Type.REGION));
        tokens.put("голосе", new Token("голосе", "голосеево", Context.LOCATION, "1", Type.REGION));
        tokens.put("троещ", new Token("троещ", "троещина", Context.LOCATION, "2", Type.REGION));
        tokens.put("прота", new Token("прота", "протасов", Context.LOCATION, "1", Type.STREET));




        //

        //tokens.put("", new Token("", "", Context.CLASSES, ""));
        tokens.put("кита", new Token("кита", "китайский", Context.CLASSES, "", Type.MAINTAG));
        tokens.put("бокс", new Token("бокс", "бокс", Context.CLASSES, "", Type.MAINTAG));
        tokens.put("$secondary", new Token("$secondary", "$secondary", Context.CLASSES, "", Type.SECONDARYTAG));

        tokens.put("в", new Token("в", "в", Context.CLASSES, "", Type.NONETAG));
        tokens.put("я", new Token("я", "ч", Context.CLASSES, "", Type.NONETAG));
        tokens.put("хочу", new Token("хочу", "", Context.CLASSES, "", Type.NONETAG));
        tokens.put("или", new Token("или", "или", Context.CLASSES, "", Type.NONETAG));
        tokens.put("и", new Token("и", "и", Context.CLASSES, "", Type.NONETAG));
        tokens.put("на", new Token("на", "и", Context.CLASSES, "", Type.NONETAG));
//        tokens.put("до", new Token("до", "и", Context.CLASSES, "", Type.NONETAG));
        tokens.put("с", new Token("с", "и", Context.CLASSES, "", Type.NONETAG));
        tokens.put("цен", new Token("цен", "цена", Context.CLASSES, "", Type.NONETAG));



        return tokens;
    }
    
    public int compare(String value) {
        if (shorttext.length() <= value.length()) {
            String svalue = value.substring(0, shorttext.length());
            //System.out.println(svalue + " " + value);
            return Math.abs(svalue.compareToIgnoreCase(shorttext));
        }
        else {
            return Integer.MAX_VALUE;
        }

    }

}

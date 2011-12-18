package com.kpoint.doumixer.nlp;

/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */

public class Price {
    private String criteria = null;
    private Float value = null;
    private Float coef = 1.0f;

    public Float getCoef() {
        return coef;
    }

    public void setCoef(Float coef) {
        this.coef = coef;
    }



    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }



    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }



    public boolean equals(Price p) {
        if (p.getCriteria().equals(getCriteria()) && p.getValue().equals(getValue()) && p.getCoef().equals(getCoef())) {
            return true;
        }
        else {
            return false;
        }

    }

    public String toString() {
        if ((criteria != null) && (value != null)) {
            return "($PRICE" + criteria + (coef * value) + ")";
        }
        else {
            return "";
        }
    }

    public void addWord(String word, Token token) {
        switch (token.getType()) {
            case EQUALITY:setCriteria(token.getProperties());
                break;
            case CURRENCY: {
                if (token.getProperties().equals("usd")) {
                    setCoef(8.0f);
                }

            }
                break;
            case PRICE: setValue(Float.parseFloat(word));
                break;

        }
    }

    public boolean isEmpty() {
        if ((value != null) || (criteria != null)) {
            return false;
        }
        else {
            return true;
        }

    }

}

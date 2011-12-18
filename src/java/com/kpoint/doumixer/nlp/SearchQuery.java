/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
package com.kpoint.doumixer.nlp;

public class SearchQuery {


    private Price price = new Price();
    private Time time = new Time();
    private Location location = new Location();
    private ClassesContent ccontent = new ClassesContent();

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    
    public String toString() {
        StringBuilder squery = new StringBuilder();

        if (price != null) {
            squery.append("{PRICE}" + price.toString());
        }

        if (time != null) {
            squery.append(time.toString());
        }

        return squery.toString();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

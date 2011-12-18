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

    public ClassesContent getCcontent() {
        return ccontent;
    }

    public void setCcontent(ClassesContent ccontent) {
        this.ccontent = ccontent;
    }

    private ClassesContent ccontent = new ClassesContent();


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    
    public String toString() {
        StringBuilder squery = new StringBuilder();

        if (price != null) {
            squery.append(price.toString());
        }

        if (time != null) {
            squery.append(time.toString());
        }

        if (location != null) {
            squery.append(location.toString());
        }

        if (ccontent != null) {
            squery.append(ccontent.toString());
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

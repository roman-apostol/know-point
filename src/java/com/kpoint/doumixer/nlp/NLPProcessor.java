
package com.kpoint.doumixer.nlp;



/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */

import java.lang.String;

com.kpoint.doumixer.nlp
public class NLPProcessor {
    public SearchQuery process(String rowQuery) {
        SearchQuery resQuery= new SearchQuery();

        return resQuery;
    }
    
    public static void main(String arg[]) {
        NLPProcessor processor = new NLPProcessor("Я хочу учить Китайский в пятницу 20:00 возле Протассового Яра");
        processor.process();
        //Courses Я хочу учить Китайский
        //Time пятницу 20:00
        //Location Протассового Яра
    }
}

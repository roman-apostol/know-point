
package com.kpoint.doumixer.nlp;



/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */


import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import java.util.regex.*;

public class NLPProcessor {
    Map<String, Token> tokens = Token.initTokens();
    Map<String, Token> words = new HashMap<String, Token>();
    SearchQuery searchQuery = null;
    
    public NLPProcessor() {
        
    }

    private void addTimeWord(String word, Token token) {

        //searchQuery;
    }


    public SearchQuery process(String rowQuery) {
        SearchQuery resQuery= new SearchQuery();
        String[] words = rowQuery.split(" ");

        //System.out.println("Row: " + rowQuery);

        //Tokens search
        Pattern pNumber = Pattern.compile("\\d+");
        Pattern pTime = Pattern.compile("\\d[\\d]:\\d\\d");
        for (String word : words) {
            int minDistance = Integer.MAX_VALUE - 1;
            Token minToken = tokens.get("$secondary");

            if (pNumber.matcher(word).matches())
                this.words.put(word, tokens.get("$price"));
            else
                if (pTime.matcher(word).matches())
                    this.words.put(word, tokens.get("$time"));
                else {
                    for (Token token : tokens.values()) {
                        int curDistance = token.compare(word);

                        if (minDistance > curDistance) {
                            minDistance = curDistance;
                            minToken = token;

                        }
                    }

                    this.words.put(word, minDistance==0?minToken:tokens.get("$secondary"));
                }

            //if (minToken != null)
                //System.out.println(word + "; token: " + minToken.getShorttext() + " dist: " + minDistance);
        }

        for (String word : words) {
            switch (this.words.get(word).getContext()) {
                case PRICE: resQuery.getPrice().addWord(word, this.words.get(word)); break;
                case TIME: resQuery.getTime().addWord(word, this.words.get(word)); break;
                case LOCATION: resQuery.getLocation().addWord(word, this.words.get(word)); break;
                case CLASSES: resQuery.getCcontent().addWord(word, this.words.get(word)); break;
            }
        }

        return resQuery;
    }

}

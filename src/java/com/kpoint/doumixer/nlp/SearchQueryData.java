package com.kpoint.doumixer.nlp;



/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 18.12.11
 * Time: 10:46
 * To change this template use File | Settings | File Templates.
 */
public interface SearchQueryData {
    public void addWord(String word, Token token);

    public String toString();

    public boolean isEmpty();

    public boolean equals(Object o);
}

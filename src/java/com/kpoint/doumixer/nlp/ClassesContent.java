package com.kpoint.doumixer.nlp;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
public class ClassesContent implements SearchQueryData{
    //Inner Class for tags
    public class Tag{
        public String value = null;
        public float weight = 0.f;

        public Tag(String value, float weight) {
            this.value = value;
            this.weight = weight;
        }
    }
    private ArrayList<Tag> tags = new ArrayList<Tag>();

    public boolean equals(ClassesContent c) {
        return false;
    }

    public void addWord(String word, Token token) {

        switch (token.getType()) {
            case MAINTAG: tags.add(new Tag(word, 1.f));
                break;
            case SECONDARYTAG: tags.add(new Tag(word, 0.5f));
                break;
            case NONETAG:
                break;

        }
    }

    public String toString() {
        StringBuilder squery = new StringBuilder();
        squery.append("$TAGS{");

        for(Tag tag : tags) {
            squery.append(tag.value + "(" + tag.weight + ")");
        }

        squery.append("}");

        return squery.toString();
    }

    public boolean isEmpty() {
        if (tags.size() > 0) {
            return false;
        }
        else {
            return true;
        }

    }
}

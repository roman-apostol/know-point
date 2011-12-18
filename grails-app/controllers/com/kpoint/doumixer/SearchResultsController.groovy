package com.kpoint.doumixer

import com.kpoint.doumixer.nlp.SearchQuery

class SearchResultsController {

    def searchResults() {
        SearchQuery searchQuery = params.searchQuery;
        println searchQuery;
        println SchoolGroup.getAll();

        def c = SchoolGroup.createCriteria();
        def result = c {
            if(null != searchQuery.price && null != searchQuery.price.value){
                if (null == searchQuery.price.criteria || searchQuery.price.criteria.equals("<=")){
                    double price = searchQuery.price.value;
                    le("price",price);
                }
            }
        }

        println result;
        [groups: result]
    }
}

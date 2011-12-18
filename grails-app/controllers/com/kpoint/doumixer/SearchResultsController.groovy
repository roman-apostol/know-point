package com.kpoint.doumixer

import com.kpoint.doumixer.nlp.SearchQuery

class SearchResultsController {

    def searchResults() {
        SearchQuery searchQuery = params.searchQuery;
        println searchQuery;
        println SchoolGroup.getAll();


        def c = SchoolGroup.createCriteria();
        def result = c {
            and{
                if(null != searchQuery.price && null != searchQuery.price.value){
                    if (null == searchQuery.price.criteria || searchQuery.price.criteria.equals("<=")){
                        double price = searchQuery.price.value;
                        le("price",price);
                    } else {
                        double price = searchQuery.price.value;
                        ge("price",price);
                    }
                }
            }
        }

        if ( null != searchQuery.location && !searchQuery.location.regions.isEmpty()){

            def newResult = result.findAll {
                searchQuery.location.regions.contains(mapRegions[it.school.region])
            }
            println(newResult);
            return [groups: newResult];

        }

        println result;
        [groups: result]
    }

    static def mapRegions = ['Holosiiv':'1','Troeshina':'2']
}

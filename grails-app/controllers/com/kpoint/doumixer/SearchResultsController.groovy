package com.kpoint.doumixer

class SearchResultsController {

    def searchResults() {
        def searchQuery = params.searchQuery;
        println searchQuery;
        [schools : School.getAll()]
    }
}

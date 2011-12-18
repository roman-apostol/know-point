package com.kpoint.doumixer

class SearchResultsController {

    def searchResults() {
        def searchQuery = params.searchQuery;
        println searchQuery;
        [groups: SchoolGroup.getAll()]

    }
}

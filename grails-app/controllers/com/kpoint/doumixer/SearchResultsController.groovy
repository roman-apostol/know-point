package com.kpoint.doumixer

class SearchResultsController {

    def searchResults() {
        [schools : School.getAll()]
    }
}

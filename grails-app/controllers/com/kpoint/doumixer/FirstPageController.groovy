package com.kpoint.doumixer

import com.kpoint.doumixer.nlp.NLPProcessor

class FirstPageController {
    def index()  { }

    def search() {
        def nmSearcher = new NLPProcessor();
        println params;
        def criteria = nmSearcher.process(params.q);
       // println criteria ;

        params.searchQuery = criteria;

        forward( controller: 'searchResults', action: 'searchResults', params: params);
    }
}


package com.kpoint.doumixer

import com.kpoint.doumixer.nlp.NLPProcessor

class FirstPageController {
   static def nmSearcher = new NLPProcessor();
    def index()  { }
    def search() {
        println params;
        def criteria = nmSearcher.process(params.q);
       // println criteria ;
        
        params.searchQuery = criteria;
        
        forward( controller: 'searchResults', action: 'searchResults', params: params);
    }
}


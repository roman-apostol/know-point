package com.kpoint.doumixer

class FirstPageController {

    def index()  { }
    def search() {
        println params;
        forward(action: "index");
    }
}


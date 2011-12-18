package com.kpoint.doumixer

class SchoolGroup {

    int id
    String level
    double price
    String name


    static constraints = {
        level(inList: ["Elementary", "Pre Intermediate", "Intermediate", "Upper Intermediate", "Advanced"])
    }
}

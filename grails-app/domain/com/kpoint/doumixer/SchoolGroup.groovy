package com.kpoint.doumixer

class SchoolGroup {

    int id
    String level
    double price
    String name
    Schedule schedule

<<<<<<< HEAD
=======

>>>>>>> b6bf3193d2e1eeee7826504f3e4766a638a40ef2
    static constraints = {
        level(inList: ["Elementary", "Pre Intermediate", "Intermediate", "Upper Intermediate", "Advanced"])
        schedule(nullable: true)
    }
}

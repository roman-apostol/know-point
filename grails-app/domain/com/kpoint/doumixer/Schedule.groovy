package com.kpoint.doumixer

class Schedule {

    int id
    Date startDate
    Date endDate

    static hasMany = [events:Event]
    static constraints = {
        startDate (blank:false)
        endDate (blank: false)
    }
    
    static mapping = {
    }
}

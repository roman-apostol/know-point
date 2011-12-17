package com.kpoint.doumixer

class Schedule {

    int id
    Date startDate
    Date endDate

    static hasMany = [events:Event]
    static hasOne = [schoolGroup:SchoolGroup]

    static constraints = {
        startDate (blank:false)
        endDate (blank: false)
    }
}

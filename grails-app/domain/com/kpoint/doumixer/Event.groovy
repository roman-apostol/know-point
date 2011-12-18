package com.kpoint.doumixer

class Event {

    int id
    String weekDay
    int startHour
    int startMinute
    int duration = 0

    Teacher teacher

    static constraints = {
        weekDay (inList :["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"])
        startHour(max: 23, min: 0)
        startMinute(max: 59, min: 0)
        teacher(nullable: true)

    }
}

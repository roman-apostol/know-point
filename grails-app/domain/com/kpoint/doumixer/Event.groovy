package com.kpoint.doumixer

import java.text.DateFormatSymbols

class Event {

    int id
    String weekDay
    int startHour
    int startMinute
    int duration = 0

    static constraints = {
        weekDay (inList :["Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"])
        startHour(max: 23, min: 0)
        startMinute(max: 59, min: 0)

    }
}

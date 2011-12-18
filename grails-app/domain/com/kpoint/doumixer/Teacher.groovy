package com.kpoint.doumixer

class Teacher {
    int id
    String name
    String description

    static belongsTo = [school: School]
    static hasMany = [events: Event]
    static constraints = {
        name (blank: false)
        description( widget: 'textarea')
    }
}

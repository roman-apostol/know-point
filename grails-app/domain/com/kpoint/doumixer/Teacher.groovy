package com.kpoint.doumixer

class Teacher {
    int id
    String name
    int age
    boolean gender
    String description

    static belongsTo = [school: School]
    static hasMany = [events: Event]
    static constraints = {
        name (blank: false)
        age (min: 15, max: 100)
        description( widget: 'textarea')
    }
}

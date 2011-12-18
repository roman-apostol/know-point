package com.kpoint.doumixer

class Teacher {
    int id
    String name
    String description
    School school
    
    static hasMany = [events: Event]
    static constraints = {
        name (blank: false)
        description( widget: 'textarea')
    }
}

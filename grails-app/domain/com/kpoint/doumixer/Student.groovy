package com.kpoint.doumixer

class Student {
    int id
    String name
    String gender
    int age

    static hasMany = [schoolGroups: SchoolGroup ]

    static constraints = {
        age (max: 100, min : 1)
        gender (inList: ["Male", "Female"])
        name (blank: false)
    }
}

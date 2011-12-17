package com.kpoint.doumixer

class School {
    int id
    String name
    String schoolType
    Double latitude
    Double longitude
    String address
    String phoneNumber
    String email


    static hasMany = [teachers: Teacher]
    static constraints = {
        name (blank: false, unique: true)
        address (blank:  false)
        email (email:true, blank: false)
        schoolType(inList: ["English", "Boxing", "Makrame", "Franche", "Auto School", "Web Design", "Photoshop"])
    }
}

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
    String region



    static hasMany = [teachers: Teacher]
    static constraints = {
        name (blank: false, unique: true)
        address (blank:  false)
        email (email:true, blank: false)
        schoolType(inList: ["Бизнес английский", "Бокс", "Макраме", "Французский", "Авто Школа"])
        region (inList: ["Голосеевский", "Дарницкий", "Деснянский", "Днепровский", "Оболонский", "Печерский",
        "Подольский", "Святошинский", "Соломенский", "Шевченковский"])
    }
}

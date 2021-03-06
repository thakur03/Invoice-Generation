package com.grailsbrains.entity

class Item {

    long id
    String itemName
    int quantity
    int price
    int amount
    int subTotal
    String description
    static belongsTo = Invoice
    static hasMany = [invoice:Invoice]

    static constraints = {
        amount(nullable:true, blank:true)
        subTotal(nullable:true, blank:true)
        description(nullable:true, blank:true)
    }
}

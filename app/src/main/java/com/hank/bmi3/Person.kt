package com.hank.bmi3

import androidx.compose.ui.text.capitalize

class Person constructor(val name:String, val weight:Float, val height:Float) {
    var book2:String = ""
    init {
        println("Person initial")
    }
    var year:String = " even"
        get() = field.replace("ven","ight")
        set(value) {
            field = value.trim()
        }

    var water:Int = 100
        get() = field.inc()
        set(value) {
            field = value * 20 + 1
        }
    constructor(name:String, weight:Float, height:Float, book:String):this(name,weight,height){
        book2 = book
    }

    fun bmi():Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello")
    }
}
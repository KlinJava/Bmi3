package com.hank.bmi3

class Person constructor(val name:String, val weight:Float, val height:Float) {
    fun bmi():Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello")
    }
}
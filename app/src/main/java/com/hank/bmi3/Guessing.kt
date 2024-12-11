package com.hank.bmi3

import kotlin.random.Random

fun main() {
//    println(Random.nextInt(1,11)) //until表示不包含
//    println((1..10).random())
    val secret = (1..10).random()
    println("secret: $secret")
    var num = 0
//    while (num != secret) {
    var bingo = false
    for (i in 1..3) {
        print("Please enter a number(1-10):")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered: $num")
        if (num < secret) {
            println("Bigger")
        } else if (num > secret) {
            println("Smaller")
        } else {
            println("You got it!")
            bingo = true
            break
        }
    }
    if (!bingo) println("Failed, the secret number is $secret")
}
package com.hank.bmi3

fun main() {
    val nums = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    nums.shuffle()
    val secret = nums.removeAt(0)
    val bomb = nums.removeAt(0)
    println(nums)
    println(secret)
    println(bomb)


    //List
    val list = mutableListOf<Int>(2,5,8)
    println(list)
    list.add(13)
    println(list)
    list.removeAt(1)
    println(list)
    list.set(1,88)
    println(list)



    //Array
    val array = intArrayOf(2,5,8)
    println(array[1])
    val ss = arrayOf("SUN","MON","TUE")
    println(ss.size)
    println(ss.get(1))
    for (day in ss) {
        println(day)
    }
    //For
    val range = 0..10
    for (i in 1..30) {
        if (i%2 == 1) {
            print("*")
        } else {
            print(" ")
        }
    }
    println()
    for (i in 1..10 step 2) print(i)
    println()

//    variable()
    var name:String? = null
    println(name?.length)
    println(name ?: 0)

}

private fun variable() {
    var counter = 0
    counter = counter + 1
    counter++
    counter = counter - 1
    println(counter)
    println(10 % 3)
    println(10 / 3)
    println(10 / 3.0)
    //Boolean
    var b = false
    var a = true
    println(!b)
    println(a && b)
    println(a || b)
    //
    val num = -8
    println(num <= 5 && num >= -3)
}
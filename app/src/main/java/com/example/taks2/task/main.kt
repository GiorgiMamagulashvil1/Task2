package com.example.taks2.task

fun main(){
    val p1 = Point(2,2)
    val p2 = Point(-2,-3)
    println("${p1.getDistance(p2)}")
    println(p1.moveSymmetry())
}
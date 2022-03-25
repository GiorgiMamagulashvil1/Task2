package com.example.taks2.task2

fun main() {
    val car: Car? = CarFactory().create("Audi")
    println("${car?.drive()}")
}
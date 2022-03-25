package com.example.taks2.task2

abstract class AbstractFactory <T>{
    abstract fun create(type:String):T?
}
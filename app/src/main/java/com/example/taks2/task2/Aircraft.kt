package com.example.taks2.task2

interface Aircraft {
    fun fly()
}

class Boeing737 : Aircraft {
    override fun fly() {
        println("Fly Boeing737!")
    }
}

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!")
    }
}

class AircraftFactory : AbstractFactory<Aircraft>() {
    override fun create(type: String): Aircraft? {
        return when (type) {
            "Boeing737" -> Boeing737()
            "Boeing777" -> Boeing777()
            else -> null
        }
    }
}
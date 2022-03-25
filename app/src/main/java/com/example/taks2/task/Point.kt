package com.example.taks2.task

import kotlin.math.sqrt

class Point(private var x: Int, private var y: Int) {

    override fun toString(): String {
        return "$x $y"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other::class.java != this::class.java) return false
        val point = other as Point
        return x == point.x && y == point.y
    }

    fun moveSymmetry(): Point {
        val x = this.x * -1
        val y = this.y * -1

        return Point(x, y)
    }

    fun getDistance(point: Point): Double {
        val c = ((this.x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y))
        return sqrt(c.toDouble())
    }
}
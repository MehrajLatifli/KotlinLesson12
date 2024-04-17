package Task4

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("\nEnter radius: ")
    val radius: Double? = scanner?.nextDouble()

    var circle = Circle(radius)
    circle.radius=radius
    println(circle.calculateArea(1,scanner))

    var triangle = Triangle(radius)
    triangle.radius=radius
    println(triangle.calculateArea(2,scanner))

    var square = Square(radius)
    square.radius=radius
    println(square.calculateArea(3,scanner))

}
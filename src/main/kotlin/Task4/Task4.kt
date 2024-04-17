package Task4

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("\nEnter radius: ")
    val radius: Double? = getValidDouble(scanner)

    val circle = Circle(radius)
    circle.radius=radius
    println(circle.calculateArea(1,scanner))

    val triangle = Triangle(radius)
    triangle.radius=radius
    println(triangle.calculateArea(2,scanner))

    val square = Square(radius)
    square.radius=radius
    println(square.calculateArea(3,scanner))
}

fun getValidDouble(scanner: Scanner): Double? {
    while (true) {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble()
        } else {
            println("Please enter a valid number.")
            print("Enter: ")
            scanner.next()
        }
    }
}
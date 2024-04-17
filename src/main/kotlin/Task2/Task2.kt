package Task2

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val cargo = Cargo()
    var cargoArray_1 = ArrayList<Cargo>()

    for (i in 1..3) {

        print("Enter name: ")
        val name = scanner.next()

        print("Enter price: ")
        val price = scanner.nextDouble()

        print("\n")

        cargoArray_1.add(Cargo(name, price))

    }


    println("Avg of Task2.Cargo: ${cargo.calculateAvgCargo(cargoArray_1)}")
}
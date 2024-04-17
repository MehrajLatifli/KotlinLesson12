package Task1

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val employee = Employee()
    var employeeArraylist_1 = ArrayList<Employee>()
    var employeeArraylist_2: ArrayList<Employee>? = null

    for (i in 1..5) {

        print("Enter name: ")
        val name = scanner.next()

        print("Enter surname: ")
        val surname = scanner.next()

        print("Enter salary: ")
        val salary = scanner.nextDouble()

        print("\n")

        employeeArraylist_1.add(Employee(name, surname, salary))
    }

    println("--------- \nEmployeeArraylist_1: \n")

    for ((index, item) in employeeArraylist_1.withIndex()) {

        println("${index + 1}) $item")
    }

    println("--------- \nfilterByBalanceGreaterThan: \n")

    employeeArraylist_2 = employee.filterBySalaryGreaterThan(employeeArraylist_1, 1000.0)

    for ((index, item) in employeeArraylist_2!!.withIndex()) {

        println("${index + 1}) $item")
    }
}

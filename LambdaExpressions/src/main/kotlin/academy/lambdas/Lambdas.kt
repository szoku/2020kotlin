package academy.lambdas

import java.lang.StringBuilder

fun main(args: Array<String>) {

    println(countTo100Apply())

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    findByLastName(employees, "Wilson")

    "Some String".apply {
        "Another String".apply {
            println(toLowerCase())
        }
    }

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach() {
        if (it.lastName == lastName) {
            println("Yes, an employee with last name $lastName")
            return
        }
    }
    println("No such a last name $lastName")
}

fun countTo100With() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

fun countTo100Apply() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

/*fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}*/

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}
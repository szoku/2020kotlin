package academy.accessmodifiers

fun main(args: Array<String>) {

    val emp = Employee("Adam")
}

class Employee constructor(firstName: String) {

    val firstName: String

    init {
        this.firstName = firstName
    }
}
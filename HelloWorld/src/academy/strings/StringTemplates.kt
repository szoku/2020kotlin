package academy.strings

import academy.declarations.Employee

fun main(args: Array<String>) {

    val employee1 = academy.strings.Employee("Lynn Jones", 5000)
    employee1.name = "Lynn Smith"

    println(employee1)

    val change = 4.22
    val numerator = 10.99
    val denumerator = 20.00
    println("To show the value of change, we use $change")
    println("The value of $numerator divided by $denumerator is ${numerator/denumerator}")

    println("The employee's id is ${employee1.id}")

    val nurseryRhyme = """Humpty Dumpty sat on the wall
        |Humpty Dumpty had a great fall
        |All the king's horses and all the king's men
        |Couldn't put Humpty together again.""".trimMargin()
    println(nurseryRhyme)
}

class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
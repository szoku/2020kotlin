package academy.anothermodulepackage

import academy.singletons.Departments
import academy.singletons.topLevel as top

fun main(args: Array<String>) {
    top("Hello from another module")
    println(Departments.IT.getDepinfo())
    println(Departments.SALES.getDepinfo())
}
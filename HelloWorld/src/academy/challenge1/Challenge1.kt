package academy.challenge1

import academy.declarations.Employee

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var liczba = 45
    liczba = 2988
    println(liczba)

    val zmienna: Any = "The any type is the root of the Ktolin class hierarchy"
    if (zmienna is String) {
        println(zmienna.toUpperCase())
    }

    println("""   1
        |  11
        | 111
        |1111.""".trimMargin())
}
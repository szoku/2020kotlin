package academy.nullreferences

fun main(args: Array<String>) {

    //str!! -> nonNull assertion, throwing exception

    val str: String? = "Not null"
    str?.let { printText("1t") }

    //nullable string
    val str4 : String? = null
    val anotherString = "This isn't nullable"
    //kotlin equals operator is safe operator -> null check is done
    println(str4 == anotherString)

    val str2 = str!!
    val str3 = str.toUpperCase()

    println(str3)

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString())
}

fun printText(text: String) {
    println(text)
}
package tryCatch

fun main(args: Array<String>) {
    println(getNumber("22"))
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("I am the finally block")
    }
}
fun main(args: Array<String>) {

    val range = 1..5

    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
}
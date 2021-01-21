package loops

fun main(args: Array<String>) {

    val range = 1..5

    for (i in range) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)

    val backwardRange = 5.downTo(1)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n)
    }
    val reversedRange = range.reversed()

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed{ index, value -> println("$value is season number $index")}

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val str = "Hello"
    println('e' in str)
    println('e' !in str)

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop;
                }
            }
        }
    }
}
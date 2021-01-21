package section6challenge

fun main(args: Array<String>) {

    for (i in -50..0 step 5) {
        println(i)
    }

    var fibonacci1 = 0
    var fibonacci2 = 1

    println("First 10 terms of Fibonacci: ")
    for (i in 1..10) {
        println("$fibonacci1")

        val sum = fibonacci1 + fibonacci2
        fibonacci1 = fibonacci2
        fibonacci2 = sum
    }

    println("Break loops ")
    for (i in 1..5) {
        println(i)
        if (i == 2) {
            break;
        }
        jloop@ for (j in 11..20){
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    break@jloop;
                }
            }
        }
    }

    val num = 101
    println(if (num < 100) {
        -234.567
    } else if (num > 100) {
        4444.555
    } else {
        0.0
    })

    val dnum = when {
        num < 100 -> -234.567
        num > 100 -> 4444.555
        else -> 0.0
    }
    println(dnum)

}
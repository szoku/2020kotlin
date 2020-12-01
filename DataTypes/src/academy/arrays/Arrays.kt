package academy.arrays

import academy.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    //println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2}

   /* println()
    for (number in evenNumbers) {
        println(number)
    }*/

    val lotsOfNumbers = Array(100000) {i -> i + 1}
    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    /*for (number in someArray){
        println(number)
    }*/
    someArray = Array(6) {i -> (i + 1) * 10}
    /*for (number in someArray){
        println(number)
    }*/

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<*>)

    val myIntArray = intArrayOf(3, 9, 434, 2, 33, 8)
    DummyClass().printNumbers(myIntArray)

    val someOtherArray = IntArray(5)
    for (number in someOtherArray){
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray: Array<Int> = myIntArray.toTypedArray()
}
package academy.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, pagePerMinute: Int): Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

open class Something {
    val someProperty: String
    constructor(someParameter: String) {
        someProperty = someParameter
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter)
}

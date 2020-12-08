package academy.dataclasses

fun main(args: Array<String>) {

    val car = Car("blue", "Toyota", 2015)
    println(car)
    val car2 = Car("blue", "Toyota", 2015)
    //equals method is ovverriden for data classes and checks if it is structurally equals
    println(car == car2)

    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016)
    println(car4)
}

data class Car (val color: String, val model: String, val year: Int) {

}
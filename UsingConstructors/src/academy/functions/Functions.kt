package academy.functions

fun main(args: Array<String>) {
    println(labelMultiply(3, 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2020)
    val car2 = Car("red","Volkswagen", 2010)
    val car3 = Car("black", "Suzuki", 1992)

    printColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)
    //spread operator * -> rozpakowuje tablice do funckji varargs, bo nie mozna przekazac bezpsorednio jak w javie
    printColors(*manyCars)

    println(Utils().upperFirstAndLast("this is all in lowercase"))
    println("this is all in lowercase".upperFirstAndLast())

}

fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

inline fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The answer is:"): String =
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}
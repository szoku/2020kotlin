package ifExpression

fun main(args: Array<String>) {
    val someCondition = true

    val num = if (someCondition) 50 else 22

    val num2 = if (someCondition) {
        println("Something")
        50
    } else {
        println("Something else")
        22
    }

    println(num)
    println(num2)
}
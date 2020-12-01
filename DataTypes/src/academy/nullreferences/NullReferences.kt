package academy.nullreferences

fun main(args: Array<String>) {
    val str: String? = "This isn't null"
    str?.toUpperCase()
    println("What happens when we do this: ${str?.toUpperCase()}")

    //str? is basically this
    if (str == null) {
        null
    } else {
        str.toUpperCase()
    }

    val someStr = null

    //?: Elvis operator
    val str2: String = someStr ?: "This is the default value"

    println(str2)

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)
}
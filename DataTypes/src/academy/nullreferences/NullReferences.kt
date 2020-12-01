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
}
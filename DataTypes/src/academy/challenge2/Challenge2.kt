package academy.challenge2

import academy.javacode.DummyClass

fun main(args: Array<String>) {
    //1. Declare a non nullable float variable two ways
    val myFloat: Float = -3847.384f
    val myFloat2 = -3847.384f

    //2. Now change both of tthose variable declarations into nullable declarations
    val myFloat3: Float? = -3847.384f
    val myFloat4: Float? = -3847.384.toFloat()

    //3. Now declare any array of type non nullable Short. Size 5.
    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2 = arrayOf<Short>(1, 2, 3, 4, 5)

    //4. Declare array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20 up to 200
    val size = 200/5
    val intArray = Array<Int?>(size) { i -> (i+1) * 5 }

    //5. Call following Java method with the folowing signature from Kotlin
    val myCharArray = charArrayOf('a', 'b', 'c')
    DummyClass().setCharArray(myCharArray)

    //6. Given the following code, declare another String variable to lowe case in one line
    val x: String? = "I AM IN UPPERCASE"
    val z: String = (x ?: "I give up").toLowerCase()
    println(z)

    //7. use let to replace am with "am not"
    x?.let { println(it.toLowerCase().replace("am", "am not"))}

    //8. You are really, really confident that the variable can't contain null
    val myNullVariable: Int? = 1
    myNullVariable!!.toDouble()
}
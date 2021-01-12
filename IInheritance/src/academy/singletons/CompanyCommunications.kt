package academy.singletons

import java.time.Year

fun main() {
    println(Departments.ACCOUNTING.getDepinfo())

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)

    wantsSomeInteface(object: SomeInterface{
        override fun mustImplement(num: Int): String {
            return "This is from mustImplement: ${num * 100}"
        }
    })
}

enum class Departments(val fullName: String, val numEmployeees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING ("Accounting", 3),
    SALES ("Sales", 20);

    fun getDepinfo() = "The $fullName department has $numEmployeees"
}

fun topLevel(str: String) = println("Top level function: $str")

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"
}

class SomeClass private constructor(val someString: String) {

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            }
            else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInteface(si: SomeInterface) {
    println("Printing from some Interface ${si.mustImplement(22)}")
}
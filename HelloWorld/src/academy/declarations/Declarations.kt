package academy.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    //Equality
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeThree.equals(employeeTwo))
    val employeeFour = employeeTwo
    println(employeeTwo === employeeFour)

    println(employeeTwo != employeeFour)
    println(employeeTwo !== employeeFour)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    //Bit operators
    val x = 0x00101101
    val y = 0x11011011

    x or y

    var something:Any = employeeFour
    if (something is Employee) {
        //val newEmployee = something as Employee
        println(something.name)
    }

    //Declarations
    var number: Int
    number = 10
    number = 20

    val employees: EmployeeSet

    val employee1 = Employee("Anna Jones", 5000)
    employee1.name = "Anna Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 150)
    } else {
        employee2 = Employee("Mike Watson", 40)
    }
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

}
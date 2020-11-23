package academy.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
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

}
interface PayRoll{
    fun calcPay(): Double
}

class MonthlySalary(val salary: Double): PayRoll{
    override fun calcPay(): Double {
        return (salary*2).toDouble()
    }
}

fun main() {
    val salary = MonthlySalary(200.00)
    println(salary.calcPay())
    println("1 -> Add Contact\n2 -> Delete Contact\n3 -> View Contact\n4 -> Create a Group" +
            "\n5 -> Delete Group\n6 -> Add Contact to Group\n7 -> View Group")
    print("Enter any of the above option: ")
    val input = readlnOrNull()?.toInt()
    when(input){
        1 -> println("Contact added")
        2 -> println("Contact deleted")
        3 -> println("Contact viewed")
        4 -> println("Group created")
        5 -> println("group del")
        6 -> println("group added")
        7 -> println("group viewed")
    }
}
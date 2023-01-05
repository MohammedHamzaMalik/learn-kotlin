//class StudentC(val firstName: String, val lastName: String, val age:Int) {
//    override fun toString(): String {
//        return "($firstName $lastName, $age)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if(other is StudentC){
//            return firstName==other.firstName && lastName==other.lastName && age==other.age
//        }
//            return false
//    }
//
//    override fun hashCode(): Int {
//        var result = firstName.hashCode()
//        result = 31 * result + lastName.hashCode()
//        result = 31 * result + age
//        return result
//    }
//}
data class StudentC(val firstName: String, val lastName: String, val age:Int)

fun main() {
    val students = mutableListOf<StudentC>(
        StudentC("John", "Doe", 20),
        StudentC("John", "Doe", 20),
        StudentC("Jake", "Ee", 21),
    )
    println()
    println(students[0])
    println("Does ${students[0]}==${students[1]}: ${students[0]==students[1]}")

    val charlie = students[0].copy(firstName="Charlie")
    students.add(charlie)
    println()
    for(student in students) println(student)
}
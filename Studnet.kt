data class Student (val firstName: String, val grade: Int)

fun main() {
    val things = arrayOf(1,2,3,"four","five")
    things[0] = "one"
    for (thing in things) {
        println(thing)
    }

    val students = arrayOf(Student("One",1),Student("Two",2),Student("Three",3))
    students[1] = Student("Two",2)
    for (student in students) {
        println(student)
    }
    val fives = Array(5,::fiver)
    fives.forEach{ println(it) }

    println(fives.size)
    println(fives.indices)
    println(fives.lastIndex)
}

fun fiver(idx: Int): Int {
    return idx*5
}
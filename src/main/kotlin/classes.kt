class PlainShort{}

class ShortClass

class WithConstructor constructor(name: String,age:Int){}

class WihtoutConstructor(name:String,age:Int){}

class MandatoryConstructor internal constructor(name:String,age:Int){}

class CourseProperty(courseTitle:String){
    val title=courseTitle
}
class Person(val firstName: String, lastName:String,var age:Int){}

class Course(courseTitle: String){
    private val title = courseTitle
    internal var description = ""
    get(){
        return if(field.isNullOrBlank()) "no desc" else "$field!"
    }
    fun show(){
        println(title)
    }
//    override fun toString(): String {
//        return "$title - $description"
//    }
}

fun main() {
    val course = Course("Kotlin")
    course.description="secrets"
    course.show()
    println(course)
}
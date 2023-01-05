fun <T: Comparable<T>> getSmaller(param1: T, param2: T): T {
    val res = param1.compareTo(param2)
    return if(res<0) param1 else param2
}
fun main() {
    println("getSmaller")

    val minInt: Int = getSmaller(42,99)
    val minD: Double = getSmaller(9.887, 3.14159)
    val minStr: String = getSmaller("kitten","kittens")

    println("$minInt, $minD, $minStr")
}
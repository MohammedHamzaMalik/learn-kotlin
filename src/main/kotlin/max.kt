fun <T: Comparable<T>> max(param1: T, param2: T): T {
    val res = param1.compareTo(param2)
    return if(res>0) param1 else param2
}
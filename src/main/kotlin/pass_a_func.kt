fun main() {
//    rep { count, msg ->
//        for (i in 1..count){
//            println(msg)
//        }
//    }
//    rep(3,"we")
    rep {times, msg ->
        for(i in 0 until times) println(msg)
    }
}

fun rep(func: (Int, String) -> Unit) {
//    fun repeat(times: Int, action:(Int) -> Unit) {
//        for(i in 0 until times) action(i)
//    }
    func(3, "WE")
}
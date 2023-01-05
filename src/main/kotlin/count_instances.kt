class Bosco{

    companion object{
        private var count=0
        fun inc(){
            count++
        }
        fun show(){
            println(count)
        }
//        var count=0
//        fun count(){

//        }
    }
    init {
        inc()
    }
}

fun nop(){
    val b=Bosco()
}

fun main() {
    val b1 = Bosco()
    val b2 = Bosco()
    nop()
    val b3 = Bosco()
    Bosco.show()
}
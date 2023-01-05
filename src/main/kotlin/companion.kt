class CantCreate private constructor(val msg: String){
    fun show(){
        println(msg)
    }

    companion object{
        fun factory(msg: String): CantCreate{
            return CantCreate(msg)
        }
        fun silly(self: CantCreate){
            println("Access: ${self.msg}")
        }
    }
}
fun main() {
    val c1 = CantCreate.factory("HEEEEYYYYY")
    c1.show()
    CantCreate.silly(c1)
}
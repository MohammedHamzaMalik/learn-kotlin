fun main() {
    val num = listOf(1,2,3,4,5,6,7,8,9,10)
    val fNum = num.filter ( fun(a:Int): Boolean { return a>7} )
    println(fNum)
    val fNum2 = num.filter(fun(a)=a>7)
    println(fNum2)

    println()
    val getAge = lambda@{ age: Int ->
        if(age>=60)
            return@lambda "senior"
        else if(age>=18)
            return@lambda "regular"
        "underage"
    }
    println(getAge(60))
}
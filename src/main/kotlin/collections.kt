fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val set = setOf(1, 2, 3, 4, 5)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    val tlist = list.map{it*2}
    println(tlist)
    val tMap = map.map { Pair(it.key,it.value*10)}.toMap()
    println(tMap)
    println()
    val flist = list.filter{it%2==1}
    println(flist)
    val fset = set.filter{it>100}
    println(fset.isEmpty())

    println(set.sortedDescending())
    println()
    println(tlist.last{it>2})
    println()
    println(list.toSet())
    println(set.toList())
}
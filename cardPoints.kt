fun main() {
    var cp = 7000
    val cl:String = when {
        cp < 1000 -> "Pearl"
        cp < 5000 -> "Silver"
        cp < 10000 -> "Gold"
        else -> "Platinum"
    }
    val p=if(cp>1 || cp==0) "s" else ""
    println("You have $cp point$p and are at the $cl level.")
}
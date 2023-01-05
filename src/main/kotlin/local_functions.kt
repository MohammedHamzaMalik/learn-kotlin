fun isPalindrome(word:String): Boolean{
    fun doCharsMatch(front:Int,back:Int):Boolean{
        if(front>=back) return true
        if(word[front].toUpperCase()!=word[back].toUpperCase()) return false
        return doCharsMatch(front+1,back-1)
    }
    if(word.length<2) return true
    return doCharsMatch(0,word.lastIndex)
}

fun main() {
    val words = listOf("aba","civic","butter","oyo")
    for(word in words) println("$word? ${isPalindrome(word)}")
}
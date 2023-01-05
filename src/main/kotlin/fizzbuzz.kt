fun main() {
    println("Fizz Buzz")
    for (i in 1..185){
        if(i%3==0 && i%5==0) println("${i} fizz buzz ")
        else if (i%3==0) println("${i} fizz ")
        else if (i%5==0) println("${i} buzz ")
    }
}
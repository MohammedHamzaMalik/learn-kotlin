import java.util.Scanner
fun main() {
    print("Enter text: ")
    val txt = readLine() ?: ""
    println("You entered: $txt , having length ${txt?.length}")

    print("\nEnter a number: ")
    val string1 = readLine() ?: ""
    val iVal: Int = string1.toIntOrNull() ?: 0
    println(iVal)

    print("\nEnter a double number: ")
    val string2 = readLine() ?: ""
    val dVal: Double = string2.toDoubleOrNull() ?: 0.0
    println(dVal)

    scanner()
}

fun scanner() {
    println()
    val scan = Scanner(System.`in`)
    print("Enter an int: ")
    val num1 = scan.nextInt()
    print("Enter a db: ")
    val num2 = scan.nextDouble()

    println()
    println(num1)
    println(num2)
}
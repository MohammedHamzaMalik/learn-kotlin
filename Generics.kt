fun main() {
    val maxInt: Int = max(4, 90)
    val maxLong: Long = max(123456789L, 999999999999L)
    val maxByte: Byte = max((-128).toByte(), ((127).toByte()))
    val maxString: String = max("Beta","Alpha")

    println("$maxInt\n$maxLong\n$maxByte\n$maxString")
}
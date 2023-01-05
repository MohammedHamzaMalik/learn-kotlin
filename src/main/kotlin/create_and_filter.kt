import java.io.File

fun main() {
    val res = "./resources"
    val sf = File("${res}/sales.txt")
    val s = mutableListOf<Double>()
    sf.forEachLine{
        val dv = it.toDoubleOrNull()
        if (dv != null) {
            s.add(dv)
        }
    }
    s.forEach{ println(it) }
}
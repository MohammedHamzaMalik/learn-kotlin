import java.io.File

fun main() {
    val res = "./resources"
    val pets = "pets.txt"
    val pfile = File("${res}/$pets")

    val file = File("${res}/text.txt")
    file.forEachLine{ println(it) }

    val writeFile = File("$res/write.txt")
    writeFile.writeText("Hello, World!")

    val pList = listOf("cat","dog","fish","bird","cat","dog","fish","bird")
    pfile.writeText("")
    pList.forEach{pfile.appendText("$it\n")}

    val newPets = mutableListOf<String>()
    pfile.forEachLine{newPets.add(it)}
    println()
    println(newPets)

    val exists = pfile.exists()
    println("\nPets exists? $exists")
}
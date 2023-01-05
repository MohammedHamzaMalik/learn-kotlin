fun main(args: Array<String>) {
//    val me = Person("Hamza","Malik")
//    val full = Person("Mohammed","Malik","Hamza")

    val location = object {
        var xP = 200
        var yP = 400
        fun printIt() {
            println("Pos $xP $yP")
        }
    }
    location.printIt()
    location.xP = 300
    location.yP = 100
    location.printIt()

//    val myCar = Car()
//    myCar.go()
//    println("Name ${myCar.MakeName}")

    val box1 = Box()
    val box2 = Box()
    val box3 = Box()
    println("Height ${box1.height}, width ${box1.width}, lenght ${box1.length}")

    box1.open()
    box1.fillContents()

    println(box1.volume)
    box1.name="Na"
    println(box1.name)
}
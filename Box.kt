class Box {
    val length = 10
    val width = 20
    val height = 5
    val volume
        get() = length*width*height
    var name: String = "Box name"
        set(value) {
            if (value.length<3) println("No")
            else field=value
        }
    fun fillContents(){
        println("Box is Filled")
    }
    fun open(){
        println("Box opened")
    }
}
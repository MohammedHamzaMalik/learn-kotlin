class Vehicle (
    val make: String, val model: String,
    val year: Int, val state: String = "CA"
    ) {
    override fun toString(): String {
        return "$year $make $model ($state)"
    }
    init {
        println("First init block - $this")
    }
    constructor(
        make:String,model:String,
        year:Int,state:String,style:String
    ): this(make,model,year,state){
        this.style=style
    }
    constructor(
        make:String,model:String,
        year:Int,state:String,style:String,
        status:String
    ): this(make,model,year,state,style){
        this.status=status
    }
    private var style=""
    private var status=""
}

fun main() {
    val v1 = Vehicle("Toyota", "Camry", 2015)
    println(v1)

    val v2 = Vehicle(state="VE", year=2019, make="Ford",model="M")
    println(v2)

    var v3 = Vehicle("Toyota", "Camry", 2015, "CA", "Sedan")
    println(v3)
    var v4 = Vehicle("Toyota", "Camry", 2015, "CA", "Sedan", "New")
    println(v4)
}
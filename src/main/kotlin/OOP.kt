//fun cars() {
//    val car1 = Car("Testa", "S Plaid", "White", 4)
//
//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//
//    var car2 = Car("Audi", "A5", "Black", 2)
//
//    println("\n")
//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")
//    car2.move()
//    car2.stop()
//
//}
//
//fun people(){
//    val user =  User("Jota", "Jato", 23)
//    //user.favoriteMovie = "Interestellar"
//}



//class Car(var name: String, var model: String, var color: String, var doors: Int) {
//
//    fun move() {
//        println("The car $name is moving")
//    }
//
//    fun stop() {
//        println("The car $name has stopped")
//    }
//}

//class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//    var name: String = name

//    init {
//        if(name.lowercase().startsWith("a")) {
//            this.name = name
//        } else {
//            this.name = "User"
//            println("The name doesn't start with the letter 'a' or 'A';")
//        }
//    }

//    constructor(name: String): this(name, "LastName", 0) {
//        println("2nd")
//    }
//
//    constructor(name: String, lastName: String): this(name, lastName, 0) {
//        println("3nd")
//    }
//}

fun calcul() {

    val result=Calculator.sum(5,10)
    println(result)

}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }

    }

}
class Car(make: String, val model: String, var color: String) {
    protected var engineType: String = ""
}

class SportsCar(make: String, model: String, color: String) extends Car(make, model, color) {
    engineType = "V8"
}

object App9 {
    def main(args: Array[String]): Unit = {
        val myCar = new Car("Toyota", "Camry", "Blue")
        println(myCar.color)
        myCar.color = "red"
        //println(myCar.make)

        val mySportsCar = new SportsCar("Ford", "Mustang", "Black")
        //mySportsCar.engineType
    }
}
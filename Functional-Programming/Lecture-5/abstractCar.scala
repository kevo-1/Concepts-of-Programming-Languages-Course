abstract class Car (val make: String, var model: String) {
    def moveBack(distance: Int): Unit
}

class DieselCar(make: String, model: String) extends Car(make, model) {
    override def moveBack(distance: Int): Unit = {
        println("Diesel car is moving back for " + distance + " KM")
    }
}

object App10 {
    def main(args: Array[String]): Unit = {
        val myDieselCar = new DieselCar("Toyota", "Coaster")
        myDieselCar.moveBack(10)
    }
}
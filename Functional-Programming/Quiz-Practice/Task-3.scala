object TemperatureTracker {
    def tempCategory(temp: Int): String = {
        if(temp > 30) {
            "Hot"
        } else if (temp > 15) {
            "Warm"
        } else {
            "Cold"
        }
    }

    def higherFunc(temps: List[Int], func: (Int) => String): List[String] = temps.map(temp => func(temp))
}

object Task3 {
    def main(args: Array[String]): Unit = {
        val temperatures: List[Int] = List(35, 22, 10, 5, 40)
        var res = TemperatureTracker.higherFunc(temperatures, TemperatureTracker.tempCategory)
        res.foreach(println)
    }
}
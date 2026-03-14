object App8 {
    def math(name: String): (Double, Double) => Double = {
        name match {
            case "addition" => (a: Double, b: Double) => a+b
            case "multiplication" => (a: Double, b:Double) => a*b
        }
    }

    def main(args: Array[String]): Unit = {
        println(math("addition")(8,8))
        println(math("multiplication")(8,8))
    }
}
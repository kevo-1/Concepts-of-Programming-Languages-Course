object App7 {
    def saySomething(greeting:String): (String) => Unit = {
        var greet: (String) => Unit = (name: String) => println(greeting + " " +name)
        return greet
    }

    def main(args: Array[String]): Unit = {
        saySomething("Hey")("John Smith")
    }
}
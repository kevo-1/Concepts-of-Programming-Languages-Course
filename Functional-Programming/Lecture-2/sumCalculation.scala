import scala.io.StdIn.readFloat

object App2 {

    def main(args: Array[String]): Unit = {
        print("Enter your first number: ")
        val param1 = readFloat()
        print("Enter your second number: ")
        val param2 = readFloat()

        val result = sum(param1 = param1, param2 = param2)
        
        println(f"Your sum = $result%2.2f")
    }

    def sum(param1: Float, param2: Float): Float = param1 + param2
}
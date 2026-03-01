import scala.io.StdIn.readFloat

object App3 {
    def main(args: Array[String]): Unit = {
        print("Enter first value: ")
        val param1 = readFloat()
        
        print("Enter second value: ")
        val param2 = readFloat()
        
        print("Enter third value: ")
        val param3 = readFloat()

        val res: Float = calc(param1 = param1 , param2 = param2 , param3 = param3 , mul3)
        println(f"Your result = $res%.2f")
    }

    def calc(param1: Float, param2: Float, param3: Float, func: (Float, Float, Float) => Float): Float = {
        func(param1, param2, param3)
    }

    def mul3(param1: Float, param2: Float, param3: Float):  Float = param1*param2*param3
}
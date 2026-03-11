object MathTools {
    def findMin(M: Int, N: Int): Int = math.min(M, N).toInt

    def solve(func: (Int, Int) => Int, a: Int, b: Int): Int = func(a, b)
}

object Task4 {
    def main(args: Array[String]): Unit = {
        val lst: List[Int] = List(2, 4, 7, 5)
        lst.foreach(num => println(MathTools.solve(MathTools.findMin,num, 6)))
    }
}
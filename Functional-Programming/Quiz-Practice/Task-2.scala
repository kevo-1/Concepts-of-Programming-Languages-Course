object MathOps {
    def cube(num: Double): Double = num*num*num

    def applyMath(nums: List[Double], func: (Double) => Double): List[Double] = nums.map(num => func(num))
}

object Task2 {
    def main(args: Array[String]): Unit = {
        val lst = List(1.5, 3.0, 4.5)
        val res = MathOps.applyMath(lst, MathOps.cube)
        res.foreach(println)
    }
}
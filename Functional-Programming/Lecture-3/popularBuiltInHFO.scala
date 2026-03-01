object App4 {
    def main(args: Array[String]): Unit = {
        
        val lst = List(1, 2, 3, 4)
        println(lst)
        println()

        // Using foreach
        lst.foreach(println)
        println("lst squared using custom foreach function:")
        lst.foreach(printSquare)
        println()

        // Using map
        println("squared lst using map:")
        val squared = lst.map(square)
        squared.foreach(println)
        println()

        // Using reduce
        println("lst reduced:")
        val res = lst.reduce(sum)
        println(res)
        println()

        // Using filter
        println("odd numbers filtered out of lst squared:")
        val even = squared.filter(isEven)
        even.foreach(println)
        println()

        //Using FoldLeft
        println("lst folded left with 100 base:")
        val fold = lst.foldLeft(100)(accumulate)
        println(fold)
    }

    def printSquare(num: Int) = println(Math.pow(num, 2)) 

    def square(num: Int): Int = num*num

    def sum(num1: Int, num2: Int): Int = num1+num2

    def isEven(num: Int): Boolean = num%2==0

    val accumulate = (base: Int, num: Int) => base + num
}
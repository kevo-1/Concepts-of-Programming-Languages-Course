object practice4App {
    def getMultiplier(factor: Int): (Int)=>Int = {
        (num: Int) => num*factor
    }

    def main(args: Array[String]): Unit = {
        var nums: List[Int] = List(1,2,3)
        var appendedNums: List[Int] = nums :+ 4
        var prependedNums: List[Int] = 0::appendedNums

        println(prependedNums.head)
        println(prependedNums.tail)
        println(prependedNums.reverse)
        println(prependedNums.isEmpty)

        var yielded = for(num <- prependedNums; if(num > 1)) yield num*10
        yielded.foreach(println)
        
        var evenSum = prependedNums.filter(num => num%2==0).reduce((acc, num) => acc + num)
        var allSum = prependedNums.foldLeft(0.0)((acc, num) => acc + num)
        println(evenSum + " " + allSum)
        println(getMultiplier(3)(4))

        val input = 5
        input match {
            case 5 => println("Five")
            case _ => println("Unknown")
        }

        var mp: Map[String, Int] = Map("Hello" -> 0, "Hi" -> 1)
        println(mp.contains("Hi"))
        println(mp.keys)
        println(mp.values)
    }


}


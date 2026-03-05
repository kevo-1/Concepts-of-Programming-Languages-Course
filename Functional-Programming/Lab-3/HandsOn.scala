object main extends App{
    var lst = List(2, 4, 7, 5)
    lst.foreach(num => CustMath.Solve(CustMath.Min, num, 6))
}

object CustMath {
    def Power(N:Int, P:Int) : Int = Math.pow(N, P).toInt

    def Min(N:Int, M:Int): Int = Math.min(N, M)

    def Solve(func: (Int, Int)=>Int, Param1: Int, Param2: Int): Unit = println(func(Param1, Param2))
}
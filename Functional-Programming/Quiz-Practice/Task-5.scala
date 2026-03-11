object RangeValidator {
    def checkNumbers(num1: Int, num2: Int): String = {
        if(num1 >= 40 && num1 <= 50 && num2 >= 40 && num2 <= 50) {
            "In range of 40 ... 50"
        } else if (num1 >= 60 && num1 <= 70 && num2 >= 60 && num2 <= 70) {
            "In range of 60 ... 70"
        } else {
            "Error"
        }
    }
}

object Task5 {
    def main(args: Array[String]): Unit = {
        var num1 = 4
        var num2 = 64
        var res: String = "Result = " + RangeValidator.checkNumbers(num1, num2)
        println(res)
    }
}
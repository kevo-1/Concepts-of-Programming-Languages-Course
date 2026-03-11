object AgeValidator {
    def isAdult(age: Int): Boolean = {
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    } 

    def processAge(func: (Int) => Boolean, age: Int): Unit = {
        if(func(age)) {
            println("Access Granted")
        } else {
            println("Access Denied")
        }
    }
}

object Task1 {
    def main(args: Array[String]): Unit = {
        var userAge = 17
        AgeValidator.processAge(AgeValidator.isAdult, userAge)
        userAge = 18
        AgeValidator.processAge(AgeValidator.isAdult, userAge)
    }
}
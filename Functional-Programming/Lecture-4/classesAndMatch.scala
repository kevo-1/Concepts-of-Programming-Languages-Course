class Employee(val id: Int, var name: String) {
    var baseSalary: Double = 0.0

    def this() = {
        this(0, "Unknown")
        this.baseSalary = 0.0
    }

    def getBonusCalculator(role: String): (Double) => Double = {
        role match {
            case "Manager" =>  (salary: Double) => salary*0.20
            case "Developer" => (salary: Double) => salary*0.10
            case _ => (salary: Double) => salary*0.0
        }
    }
}

object App5 {
    def main(args: Array[String]): Unit = {
        var employee = new Employee(101, "Alice")
        employee.baseSalary = 5000.0
        val devBonusFunc = employee.getBonusCalculator("Developer")
        var bonusAmount = devBonusFunc(employee.baseSalary)
        println("Calculated Bonus: " + bonusAmount)
    }
}
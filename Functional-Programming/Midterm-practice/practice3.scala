trait tempPerson {
    val name: String
    def sleep(): Unit = {
        println("Sleeping...")
    }
}


abstract class Employee extends tempPerson {
    protected var salary: Double = 0.0

    def work(): Unit
}


class Manager(override val name: String, var startingSalary: Double) extends Employee {
    salary = startingSalary
    def this() = {
        this("Manager", 10000)
    }

    override def work(): Unit =  {
        println("Working...")
    }
}

object MainPersonApp {
    def main (args: Array[String]): Unit = {
        var weekDays: Array[String] = Array("Tuesday", "Friday", "Sunday") 
        var i: Int = 0
        while (i < weekDays.length) {
            println(weekDays(i))
            i+=1
        }

        for (i <- 1 to 2 ; j <- 1 until 3) {
            println(i*j)
        }

        var manager: Manager = new Manager()
        val status: String = if(manager.startingSalary >= 5000) "High" else "Low"
        print(status)
    }

    
}
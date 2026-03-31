trait Person {
    val id: Int
    var department: String = "FCIS"

    def describe(): Unit
}

class Student(var name: String) extends Person {
    override val id: Int = 2023
    def this() = {
        this("John")
    }

    override def describe(): Unit = {
        println("Student id " + id + ", Name " + name + ", Dept " + department)
    }
}

case class Course(code: String, credits: Int)


object MainApp {
    var Courses: List[Course] = List(Course("CIS30", 2), Course("SCI50", 4), Course("IS130", 1))

    var twoCredits: List[Course] = Courses.filter(course => course.credits >= 2)
    var totalCredits: Int = Courses.foldLeft(0)((acc, course) => acc + course.credits)

    var StudentsGrades: Map[Student, Int] = Map(Student("John") -> 2, Student("Sally") -> 4, Student("Smith") -> 3)

    for (stud <- StudentsGrades.keys) {
        var Grade: Int = StudentsGrades(stud)
        Grade match {
            case 2 => println("C")
            case 3 => println("B")
            case 4 => println("A")
            case _ => println("Unknown")
        }
    }
}
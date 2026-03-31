case class TempStudent(name: String, grades: List[Int]) extends Printable {
    def average(): Double = {
        grades.foldLeft(0.0)((acc, grade) => acc + grade)/grades.length
    }

    def letterGrade(): String = {
        var avgGrade: Double = average()

        if(avgGrade >= 90) {
            return "A"
        } else if(avgGrade >= 75) {
            return "B"
        } else if(avgGrade >= 60) {
            return "C"
        } else {
            return "D"
        }
    }

    override def summary(): String = {
        String(name + "-- avg: " + average() + " -- grade: " + letterGrade())
    }
}


trait Printable {
    def summary():String
}


def topStudents(students: List[TempStudent]): List[TempStudent] = students.filter(student => student.letterGrade() == "A")

def classSummary(students: List[TempStudent]): Unit = students.foreach(student => println(student.summary()))

def highestAverage(students: List[TempStudent]): TempStudent = students.maxBy(_.average())
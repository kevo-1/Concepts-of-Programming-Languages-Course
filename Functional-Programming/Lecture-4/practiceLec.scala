class Student(val id: Int, var name: String, val marks: List[Float]) {
    def getTotalMarks(): Float = {
        marks.foldLeft(0.0f)((total, mark) => total + mark)
    }

    def getBonus(activity: String): Float = {
        activity match {
            case "Sports" => 10.0f
            case "Arts" => 5.0f
            case _ => 0.0f 
        }
    }
}


object App6 {
    def main(args: Array[String]): Unit = {
        val studList: List[Student] = List(new Student(1, "Alice", List(20.0f, 32.0f)), new Student(2, "Alice", List(10.0f, 12.0f)))

        var topStuds = for(stud <- studList if stud.getTotalMarks() >= 50.0f) yield(stud.name)

        println("Top Students: " + topStuds)

        val exStud: Student = studList(0)
    
        val totalMarks = processStudent(exStud, (exStud) => exStud.getTotalMarks() + exStud.getBonus("Sports"))
        println("Students top marks: " + totalMarks)
    }

    def processStudent(stud: Student, func: (Student) => Float): Float = func(stud)
}
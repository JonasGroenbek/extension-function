package extensionFunctions

fun main(args : Array<String>) {

        var Malik: Person = Person(22,"Malik","CPHBusiness","app development")
        var Someone: Person = Person(42, "Someone", "Harvard", "social anthropology")

        //bad usecase, no reason not to be encapsulated in Person class
        fun Person.introduce(){
                println("Hello my name is ${this.name} and I am ${age} years old." +
                        " I attend school at {$school} and my favourite course is ${favouriteCourse}")
        }

        Malik.introduce()

        //better usecase prettier when chaining  x.foo(y) / foo(x, y)  &
        var CPHBusiness: School = School("CPHBusiness","Nørgaardsvej 30, 2800 Kongens Lyngby",
                arrayOf("Anders", "Kasper", "Lars", "Jan", "Palle", "Tobias", "Thomas", "Jacob", "Ronnie"))

        fun School.hasStudent(student: Person){
           if (student.school == this.name) println("${student.name} attends!") else println("${student.name} doesn't attend")
        }

        CPHBusiness.hasStudent(Malik)

        //alternative
        fun doesSchoolHaveStudent(person: Person, school: School){
                if(person.school === school.name){
                        println("${person.name} attends!")
                } else {
                        println("${person.name} doesn't attend")
                }
        }
        doesSchoolHaveStudent(Someone, CPHBusiness)

        //can be used on kotlin standard libraries and third party libraries like toast in app development
        fun String.print(){
                println("${this}")
        }
        val printMe : String = "You can call my extension functions without even using me on a specific"
        printMe.print()
}

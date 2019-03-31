package extensionFunctions

fun main(args : Array<String>) {
   val example: Example = Example("I am an example");
    val boringString: String = "I am boring...";
    example.printExample();
    //boringString.print() //error showcasing print() does not belong to string class
}

class Example(val rndString: String){
    fun String.print(){
        println("${this}")
    }

    fun printExample(){
        rndString.print();
    }
}

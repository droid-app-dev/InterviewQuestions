package Kotlin



fun main(args:String)
{


    val sum:(Int,Int) ->Int={a:Int,b:Int-> a+b}



    println(sum(10,30))



    // Define a higher-order function that takes a parameter and returns a lambda
    fun operation(type: String): (Int, Int) -> Int {
        return when (type) {
            "add" -> { a, b -> a + b }
            "subtract" -> { a, b -> a - b }
            "multiply" -> { a, b -> a * b }
            "divide" -> { a, b -> a / b }
            else -> throw IllegalArgumentException("Unknown operation type")
        }
    }

    // Use the higher-order function
    val addition = operation("add")
    println(addition(5, 3)) // Output: 8

    val subtraction = operation("subtract")
    println(subtraction(5, 3)) // Output: 2

}
class Lamdafunctions {







}
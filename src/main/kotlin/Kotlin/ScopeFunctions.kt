package Kotlin


fun main(args:Array<String>) {


    // Scope functions are functions that can execute a block of code with in the context of an object

    /*  let
        The let function is typically used for null-checks or to execute code blocks on non-null objects  */

    var name:String="Kotlin"

    val fullname = name?.let {
        "My name is $it"
    }
    println(fullname)




     //run
    val runsample="run"
    val runres=runsample.run {
        println("this is $this scope function")
        this.length
    }
    println("string length    :- "+runres)


     //also
    val person_also=Person("also",40)
    val  person_also_edited=person_also.also {
        it.name="Harish"
        it.age=90
    }
    println("Person also edited "+person_also_edited)

     //apply
    val person_apply=Person("apply",40)
    val person_apply_edited=person_apply.apply {
        this.name="Harish"
        this.age=95
    }
    println("Person  apply edited "+person_apply_edited)

     //with
    val person_with=Person("with",50)
    with(person_with){
        println("Person with eaxmple :- ${this.name}   ${this.age}")
    }

}


data class Person(var name:String,var age:Int)
class ScopeFunctions {
}
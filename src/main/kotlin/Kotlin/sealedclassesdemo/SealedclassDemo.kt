package Kotlin.sealedclassesdemo


//class PostDoctorate:Student()

fun  main(args:Array<String>)
{

    val me:Student=Doctorate()

    when(me){

        is Undergraduate -> println("Undergraduate")

        is Doctorate -> println("Doctorate")

        is PostGraduate -> println("PostGraduate")
    }

}



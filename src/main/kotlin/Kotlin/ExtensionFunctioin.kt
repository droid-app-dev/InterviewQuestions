package Kotlin

import Kotlin.sealedclassesdemo.Student

fun main(array: Array<String>) {


    /*  In Kotlin, extension functions allow you to add new functionality to existing classes
        without modifying their source code   */

    fun String.reverse(): String {
        return this.reversed()
    }

    fun Int.addplus1():Int{
        return this+1
    }

    val name = "Koltin"
    val age=20;
    val reversed = name.reverse()

    println(reversed)
    println(age.addplus1())





}



class ExtensionFunctioin
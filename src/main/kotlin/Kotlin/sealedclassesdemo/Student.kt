package Kotlin.sealedclassesdemo

sealed class Student {

}

class Undergraduate():Student()
class PostGraduate():Student()
class Doctorate():Student()


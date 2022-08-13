package com.learnbasic

abstract class A{

    //concrete function ->with prototype + body
    fun name(){
        println("My name is Buddhadeb")
    }

    //abstract class
    abstract fun message()
}
//We can't make object of this class

//so to use the abstract class
//you have to provide the implementation of abstract method


class B:A(){
override fun message(){
    println("This is child")

}
}

fun main() {
    val obj=B()
    obj.message()
    obj.name()
}